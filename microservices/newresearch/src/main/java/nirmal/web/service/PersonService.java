package nirmal.web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nirmal.domain.Person;
import nirmal.utils.SortLastNameComparator;

@Service
public class PersonService implements PersonInterface {

  @Autowired
  SortLastNameComparator sl;

  List<Person> people;

  public PersonService() {
    people = Arrays.asList(
        Person.builder().id(1).firstName("Nirmal").lastName("Mohanty").age(26).build(),
        Person.builder().id(2).firstName("Bruce").lastName("Wayne").age(30).build(),
        Person.builder().id(3).firstName("Peter").lastName("Parker").age(40).build(),
        Person.builder().id(4).firstName("Toni").lastName("Stark").age(30).build(),
        Person.builder().id(5).firstName("Bruce").lastName("Banner").age(30).build(),
        Person.builder().id(6).firstName("Natasha").lastName("Romanoff").age(30).build(),
        Person.builder().id(7).firstName("Wanda").lastName("Maximoff").age(30).build(),
        Person.builder().id(8).firstName("Steve").lastName("Rogers").age(30).build(),
        Person.builder().id(9).firstName("Bucky").lastName("Barnes").age(30).build(),
        Person.builder().id(10).firstName("Black").lastName("Panther").age(30).build());
  }

  @Override
  public List<Person> getListOfPeople() {

    return this.people;
  }

  @Override
  public List<Person> getLastSorted() {
    // Collections.sort(this.people, sl);
    // Java 7 way
    // Collections.sort(this.people, new Comparator<Person>() {
    //
    // @Override
    // public int compare(Person p1, Person p2) {
    // return p1.getLastName().compareTo(p2.getLastName());
    // }
    // });
    // Java 8 way

    Collections.sort(this.people,
        (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

    return people;
  }


  @Override
  public List<Person> lastNameStartsWith(String startsWith) {

    List<Person> startsWithR = new ArrayList<>();
    for (Person p : people) {
      if (p.getLastName().startsWith(startsWith))
        startsWithR.add(p);
    }

    return startsWithR;
  }

}
