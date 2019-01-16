package MyPreparation.Java8.Java8Features;


import models.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceExmp2 {
  public static void main(String[] args) {
    List<Person> personList =
        Arrays.asList(
            Person.builder().firstName("Scarlet").lastName("Johanson").age(30).build(),
            Person.builder().firstName("Nirmal").lastName("Mohanty").age(27).build(),
            Person.builder().firstName("Bruce").lastName("Wayne").age(30).build(),
            Person.builder().firstName("Natalie").lastName("Portman").age(27).build());

    // Method-1
    /*
    Collections.sort(personList, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
    */

    // Method-2
    /*
    Function<Person,String> getLastName=Person::getLastName;
    Collections.sort(personList, Comparator.comparing(getLastName));
    */

    //Method-3
    /*Collections.sort(personList, Comparator.comparing(Person::getLastName));*/

    //Method-4
    personList.sort(Comparator.comparing(Person::getFirstName));

    // personList.forEach(person -> System.out.println(person.getFirstName()));
    personList.forEach(System.out::println);

    personList.forEach(
        person -> {
          if (person.getLastName().startsWith("M"))
            System.out.println(person.getFirstName());
        });

    //Map<List<Person>,String> groupingList=personList.
  }
}
