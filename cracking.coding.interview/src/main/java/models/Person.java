package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

  private int id;
  private String firstName;
  private String lastName;
  private int age;

  // public static Comparator<Person> lastNameComparator = new Comparator<Person>() {
  //
  // @Override
  // public int compare(Person p1, Person p2) {
  // return p1.getLastName().compareTo(p2.getLastName());
  // }
  // };

}
