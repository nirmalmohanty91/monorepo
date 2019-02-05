package MyPreparation.collectionsinjava.ComparatorAndComparable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter
class Emp2 {
  int id;
  int age;
  String firstName;
  String lastName;

  public Emp2(int id, int age, String firstName, String lastName) {
    this.id = id;
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
