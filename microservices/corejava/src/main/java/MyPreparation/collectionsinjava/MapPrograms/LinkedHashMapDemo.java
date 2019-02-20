package MyPreparation.collectionsinjava.MapPrograms;

import models.Employee;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
  public static void main(String[] args) {
    Map<Employee, String> map = new LinkedHashMap<>();
    map.put(Employee.builder().id(11).name("Nirmal").build(), "z");
    map.put(Employee.builder().id(31).name("Batman").build(), "b");
    map.put(Employee.builder().id(42).name("Scarlet").build(), "a");
    map.put(Employee.builder().id(24).name("Daredevil").build(), "c");
    System.out.println(map);
  }
}
