package nirmal.service;

import nirmal.domain.Person;

import java.util.List;

public interface PersonInterface {
  List<Person> getListOfPeople();

  List<Person> getLastSorted();

  List<Person> lastNameStartsWith(String startsWith);
}
