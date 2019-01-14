package MyPreparation.collectionprograms.SetPrograms;

import java.util.HashSet;

/**
 * 1. Doesn't maintain order
 * 2. Provides constant time performance
 * 3. Not Synchronized
 * 4. Internally uses HashMap to store the object
 * 5. HashSet allows only one null element.
 * 6. HashSet doesn’t allow duplicate elements.
 * 7. HashSet is slightly slower than HashMap.
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

    stringHashSet.remove("STRUTS");
    System.out.println(stringHashSet);
  }
}
