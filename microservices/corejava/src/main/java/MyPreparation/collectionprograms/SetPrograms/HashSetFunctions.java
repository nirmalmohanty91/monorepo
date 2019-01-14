package MyPreparation.collectionprograms.SetPrograms;

import java.util.HashSet;

/**
 * 1. Doesn't maintain order
 * 2. Provides constant time performance
 * 3. Not Synchronized
 * 4. Internally uses HashMap to store the object
 * */

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
  }
}
