package nirmal.controller;

import nirmal.domain.Person;
import nirmal.domain.SwaggerUIDetails;
import nirmal.service.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

  @Autowired private SwaggerUIDetails myConfig;

  @Autowired private PersonInterface personService;

  @GetMapping(path = "/yml", produces = MediaType.APPLICATION_JSON_VALUE)
  public SwaggerUIDetails printYaml() {
    return myConfig;
  }

  @GetMapping("/list")
  public List<Person> getPersonList() {
    return personService.getListOfPeople();
  }

  @GetMapping("/sortedLastName")
  public List<Person> getLastNameSortedList() {
    return personService.getLastSorted();
  }

  @GetMapping(path = "/lastNameStartsWith/{startsWith}")
  public List<Person> lastNameBeginsWithR(@PathVariable("startsWith") String startsWith) {
    return personService.lastNameStartsWith(startsWith);
  }
}
