package MyPreparation.collectionsinjava.MapPrograms;

import models.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
  public static void main(String[] args) {
    /**
     * This code breaks in runtime as employee objects are not comparable if you uncomment line 15.
     * To resolve this either implement comparable in the Employee class or pass a comparator to the
     * constructor of TreeMap
     */
    // Map<Employee, String> map = new TreeMap<>();
    /** Natural Ordering comparator */
    // Map<Employee, String> map = new TreeMap<>(Comparator.comparing(Employee::getName));
    /** Reverse Ordering comparator */
    Map<Employee, String> map = new TreeMap<>(Comparator.comparing(Employee::getName).reversed());

    map.put(Employee.builder().id(11).name("Nirmal").build(), "z");
    map.put(Employee.builder().id(31).name("Batman").build(), "b");
    map.put(Employee.builder().id(42).name("Scarlet").build(), "a");
    map.put(Employee.builder().id(24).name("Daredevil").build(), "c");

    System.out.println(map);
  }
}
