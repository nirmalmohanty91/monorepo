package MyPreparation.collectionsinjava.ComparatorAndComparable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver {
  public static void main(String[] args) {

    List<Emp1> list = new ArrayList<>();
    list.add(new Emp1(1, 30, "Hello"));
    list.add(new Emp1(4, 20, "Hello"));
    list.add(new Emp1(2, 50, "Hello"));
    list.add(new Emp1(6, 10, "Hello"));
    System.out.println(list);
    System.out.println("Using comparable for sorting:");
    Collections.sort(list);
    System.out.println(list);

    List<Emp2> list2 = new ArrayList<>();
    list2.add(new Emp2(1, 30, "Hello"));
    list2.add(new Emp2(4, 20, "Hello"));
    list2.add(new Emp2(2, 50, "Hello"));
    list2.add(new Emp2(6, 10, "Hello"));
    System.out.println("Using age comparator: ");
    list2.sort(new AgeComparator());
    System.out.println(list2);

    System.out.println("Using id comparator: ");
    list2.sort(new IdComparator());
    System.out.println(list2);
  }
}

@EqualsAndHashCode
@ToString
class Emp1 implements Comparable<Emp1> {
  int id;
  int age;
  String name;

  public Emp1(int id, int age, String name) {
    this.id = id;
    this.age = age;
    this.name = name;
  }

  @Override
  public int compareTo(Emp1 o) {
    return this.age - o.age;
  }
}

@EqualsAndHashCode
@ToString
class Emp2 {
  int id;
  int age;
  String name;

  public Emp2(int id, int age, String name) {
    this.id = id;
    this.age = age;
    this.name = name;
  }
}

class AgeComparator implements Comparator<Emp2> {

  @Override
  public int compare(Emp2 o1, Emp2 o2) {
    return o1.age - o2.age;
  }
}

class IdComparator implements Comparator<Emp2> {

  @Override
  public int compare(Emp2 o1, Emp2 o2) {
    return o1.id - o2.id;
  }
}
