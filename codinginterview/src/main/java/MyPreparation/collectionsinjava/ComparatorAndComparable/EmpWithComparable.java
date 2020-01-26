package MyPreparation.collectionsinjava.ComparatorAndComparable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
class EmpWithComparable implements Comparable<EmpWithComparable> {
  int id;
  int age;
  String name;

  public EmpWithComparable(int id, int age, String name) {
    this.id = id;
    this.age = age;
    this.name = name;
  }

  @Override
  public int compareTo(EmpWithComparable o) {
    return this.age - o.age;
  }
}
