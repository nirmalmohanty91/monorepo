package MyPreparation.collectionsinjava.MapPrograms.programs;

import models.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SortingMapBasedOnValue {

  public static void main(String[] args) {

    Map<String, Employee> map = new HashMap<>();
    map.put("z", Employee.builder().id(11).name("Nirmal").build());
    map.put("b", Employee.builder().id(31).name("Batman").build());
    map.put("a", Employee.builder().id(42).name("Scarlet").build());
    map.put("c", Employee.builder().id(24).name("Deepankar").build());
    System.out.println("Before Sorting:");
    System.out.println(map);
    System.out.println("Java 7 sorting: ");
    System.out.println(SortingMapBasedOnValue.usingJava7(map));
    System.out.println("Java 8 Sorting: ");
    System.out.println(SortingMapBasedOnValue.usingJava8(map));
  }

  public static Map<String, Employee> usingJava7(Map<String, Employee> map) {
    List<Map.Entry<String, Employee>> list = new ArrayList<>(map.entrySet());
    list.sort((a, b) -> a.getValue().getName().compareTo(b.getValue().getName()));
    LinkedHashMap<String, Employee> linkedHashMap = new LinkedHashMap<>();

    for (Map.Entry<String, Employee> entry : list) {
      linkedHashMap.put(entry.getKey(), entry.getValue());
    }

    return linkedHashMap;
  }

  public static Map<String, Employee> usingJava8(Map<String, Employee> map) {
    return map.entrySet()
        .stream()
        .sorted((e1, e2) -> e2.getValue().getName().compareTo(e1.getValue().getName()))
        .collect(
            Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
  }
}
