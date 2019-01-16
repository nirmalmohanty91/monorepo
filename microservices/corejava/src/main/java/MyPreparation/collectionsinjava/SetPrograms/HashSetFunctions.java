package MyPreparation.collectionsinjava.SetPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

/**
 * 1. Doesn't maintain order
 * 2. Provides constant time performance
 * 3. Not Synchronized
 * 4. Internally uses HashMap to store the object
 * 5. HashSet allows only one null element.
 * 6. HashSet doesn’t allow duplicate elements.
 * 7. HashSet is slightly slower than HashMap.
 */
public class HashSetFunctions {

  public static void main(String[] args) {

    HashSet<String> stringHashSet = new HashSet<>();
    stringHashSet.add("JAVA");
    stringHashSet.add("JSP");
    stringHashSet.add("STRUTS");
    stringHashSet.add("HIBERNATE");
    stringHashSet.add("JSP");
    stringHashSet.add("JAVA");
    System.out.println(stringHashSet);
    System.out.println("Remove STRUTS: ");
    stringHashSet.remove("STRUTS");
    System.out.println(stringHashSet);

    System.out.println("Iterating HashSet:(Java 7)");
    System.out.println("--------------------");
    Iterator<String> iterator = stringHashSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("Iterating HashSet using forEach:(Java 8)");
    System.out.println("--------------------");
    stringHashSet.forEach(temp -> System.out.println(temp));

    System.out.println("Iterating Using Stream: ");
    System.out.println("--------------------");
    stringHashSet.stream().forEach(x -> System.out.println(x));

    HashSet<Integer> intHashSet = new HashSet<>();

    for (int i = 0; i <= 50; i++) {
      intHashSet.add(i * 2);
    }
    System.out.println("Size of set: " + intHashSet.size());
    Spliterator<Integer> spliterator = intHashSet.spliterator();
    System.out.println("Estimated size: " + spliterator.estimateSize());
    System.out.println("Using Spliterator:(Java 8) ");
    System.out.println("--------------------");
    spliterator.forEachRemaining(x -> System.out.print(x + " "));
    System.out.println();
  }
}
