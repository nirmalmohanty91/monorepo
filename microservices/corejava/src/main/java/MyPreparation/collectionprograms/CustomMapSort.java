package MyPreparation.collectionprograms;

import models.Employee;

import java.util.*;

public class CustomMapSort {

  public static void main(String[] args) {

    Map<String, Employee> map = new HashMap<>();
    map.put("z", Employee.builder().id(11).name("Nirmal").build());
    map.put("b", Employee.builder().id(31).name("Batman").build());
    map.put("a", Employee.builder().id(42).name("Scarlet").build());
    map.put("c", Employee.builder().id(24).name("Deepankar").build());

    System.out.println("Before Sort:");
    printMap(map);

    Map<String, Employee> sortedMap = sortByValue(map);

    System.out.println("\nAfter Sort by Name:");
    printMap(sortedMap);
  }

  private static Map<String, Employee> sortByValue(Map<String, Employee> map) {
    // 1. Convert Map to List of Map.Entry
    List<Map.Entry<String, Employee>> list = new LinkedList<>(map.entrySet());

    // 2. Sort list with Collections.sort(), provide a custom Comparator. Try switch the o1 o2
    // position for a different order
    // This is till java 7
    /*
      Collections.sort(
        list,
        new Comparator<Map.Entry<String, Employee>>() {
          public int compare(Map.Entry<String, Employee> o1, Map.Entry<String, Employee> o2) {
            return (o1.getKey()).compareTo(o2.getKey());
          }
        });
    */
    // Java 8 supports list.sort() directly. So no need to use Collection.sort() anymore
    list.sort((Map.Entry<String, Employee> o1, Map.Entry<String, Employee> o2) -> o1.getValue().getName().compareTo(o2.getValue().getName()));
    //Can further simplified as below
    //list.sort(Comparator.comparing(Map.Entry<String, Employee> :: ));
    // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
    Map<String, Employee> sortedMap = new LinkedHashMap<>();

    for (Map.Entry<String, Employee> entry : list) {
      sortedMap.put(entry.getKey(), entry.getValue());
    }

    return sortedMap;
  }

  public static <K, V> void printMap(Map<K, V> map) {

    for (Map.Entry<K, V> entry : map.entrySet()) {
      System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
    }
  }
}
