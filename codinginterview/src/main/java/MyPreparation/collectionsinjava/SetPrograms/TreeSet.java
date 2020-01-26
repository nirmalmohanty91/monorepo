package MyPreparation.collectionsinjava.SetPrograms;

import models.Employee;

import java.util.Comparator;
import java.util.Set;

public class TreeSet {
  public static void main(String[] args) {
    /**
     * this code will break at runtime as the employee object doesn't implement comparable. So we
     * are passing a comparator to avoid the runtime exception
     */
    Set<Employee> stringHashSet = new java.util.TreeSet<>(Comparator.comparing(Employee::getName));
    stringHashSet.add(Employee.builder().id(11).name("Nirmal").build());
    stringHashSet.add(Employee.builder().id(5).name("Batman").build());
    stringHashSet.add(Employee.builder().id(1).name("Vigilante").build());
    stringHashSet.add(Employee.builder().id(111).name("Arrow").build());
    stringHashSet.add(Employee.builder().id(81).name("Zipkin").build());
    System.out.println(stringHashSet);
  }
}
