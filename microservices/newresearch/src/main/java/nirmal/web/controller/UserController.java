package nirmal.web.controller;

import nirmal.domain.Person;
import nirmal.domain.SwaggerUIDetails;
import nirmal.domain.User;
import nirmal.web.service.PersonInterface;
import nirmal.web.service.UserService;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "user") //This annotation tells Spring MVC that this is controller which has REST endpoint
public class UserController {
  public static final int ID_LENGTH = 10;
 // @Autowired UsersCache usersCache;
  @Autowired User user;
  @Autowired UserService userService;
  @Autowired private SwaggerUIDetails myConfig;
  @Autowired private PersonInterface personService;

  @GetMapping(path = "searchUserByFirstName")
  public List<User> searchUserByFirstName(@RequestParam(required = true) String firstName) {
    List<User> list = userService.getUserByFirstName(firstName);
    return list;
  }

  @PostMapping(
      path = "/insertUser",
      consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public User insertUser(@RequestBody User user) {
    boolean inserted = userService.insertData(user);
    if (inserted) return user;
    else return null;
  }

  public String generateUniqueId() {
    return RandomStringUtils.randomAlphanumeric(ID_LENGTH);
  }

  @GetMapping(path = "search/{name}/{id}")
  public List<User> search(
      @PathVariable(required = false) String name, @PathVariable(required = false) String id) {

    if (!StringUtils.isEmpty(name)) {
      // Query for search name to DB
    }

    if (!StringUtils.isEmpty(id)) {
      int i = Integer.parseInt(id);
      // Query for search id to DB
    }

    return null;
  }

  //  @GetMapping(value = "/{name}")
  //  public Users getUser(@PathVariable final String name) {
  //    return usersCache.getUser(name);
  //  }

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

  @GetMapping(path = "/testingException")
  public void getError() {
    userService.getError();
  }
}
