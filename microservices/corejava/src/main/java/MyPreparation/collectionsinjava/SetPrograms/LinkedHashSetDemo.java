package MyPreparation.collectionsinjava.SetPrograms;

import models.Employee;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
  public static void main(String[] args) {
    HashSet<Employee> stringHashSet = new LinkedHashSet<>();
    stringHashSet.add(Employee.builder().id(11).name("Nirmal").build());
    stringHashSet.add(Employee.builder().id(5).name("Batman").build());
    stringHashSet.add(Employee.builder().id(1).name("Vigilante").build());
    stringHashSet.add(Employee.builder().id(111).name("Arrow").build());
    stringHashSet.add(Employee.builder().id(81).name("Zipkin").build());
    System.out.println(stringHashSet);
  }
}
