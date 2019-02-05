package MyPreparation.collectionsinjava.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DifferentTypesOfSorting {
  public static void main(String[] args) {

    List<EmpWithComparable> list = new ArrayList<>();
    list.add(new EmpWithComparable(1, 30, "Hello"));
    list.add(new EmpWithComparable(4, 20, "Hello"));
    list.add(new EmpWithComparable(2, 50, "Hello"));
    list.add(new EmpWithComparable(6, 10, "Hello"));
    // DifferentTypesOfSorting.tillJava7SortingComparable(list);

    List<Emp2> list2 = new ArrayList<>();
    list2.add(new Emp2(1, 30, "Nirmal", "Mohanty"));
    list2.add(new Emp2(4, 20, "Nirmal", "Chandra"));
    list2.add(new Emp2(2, 50, "Nirmal", "Batman"));
    list2.add(new Emp2(6, 10, "Nirmal", "Hulk"));
    // DifferentTypesOfSorting.tillJava7SortingComparator(list2);
    DifferentTypesOfSorting.java8WayOfUsingComparator(list2);
  }

  public static void tillJava7SortingComparable(List<EmpWithComparable> list) {
    System.out.println(list);
    System.out.println("Using comparable for sorting:");
    Collections.sort(list);
    System.out.println(list);
  }

  public static void tillJava7SortingComparator(List<Emp2> list) {
    System.out.println("Using age comparator: ");
    list.sort(new AgeComparator());
    System.out.println(list);

    System.out.println("Using id comparator: ");
    list.sort(new IdComparator());
    System.out.println(list);
  }
  // In java 8 we don't have to define a separate class for comparator implementation
  public static void java8WayOfUsingComparator(List<Emp2> list) {
    System.out.println(list);
    // This sorting is natural order sorting by default

    System.out.println("Using sort() of List interface:");
    list.sort(Comparator.comparing(e -> e.getAge()));
    System.out.println(list);
    System.out.println("Using Collections:");
    // Comparator<Emp2> idComparator = Comparator.comparing(e -> e.getAge());
    Comparator<Emp2> idComparator = Comparator.comparing(Emp2::getAge);
    Collections.sort(list, idComparator);
    System.out.println(list);
    System.out.println("Reverse sorting:");
    list.sort(idComparator.reversed());
    System.out.println(list);

    // Comparator for multiple sort

    Comparator<Emp2> firstNameAndLastName =
        Comparator.comparing(Emp2::getFirstName).thenComparing(Emp2::getLastName);
    list.sort(firstNameAndLastName);
    System.out.println(list);
    list.sort(firstNameAndLastName.reversed());
    System.out.println(list);
  }
}
