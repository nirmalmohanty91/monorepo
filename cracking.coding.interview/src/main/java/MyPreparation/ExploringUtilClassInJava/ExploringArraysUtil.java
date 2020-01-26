package MyPreparation.ExploringUtilClassInJava;

import utils.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExploringArraysUtil {
  public static void main(String[] args) {
    int[] arr1 = {80, 67, 16, 16, 3, 1, 5, 2};
    int[] arr2 = {80, 67, 16, 3, 1, 2, 1};

    // Sorting elements from one index to another
    Arrays.sort(arr1, 1, 5);
    Utility.printArray(arr1);
    // Comparing two arrays
    System.out.println(Arrays.equals(arr1, arr2));
    // String representation of an array
    System.out.println(Arrays.toString(arr1));

    // Sorted array
    int[] arr3 = {1, 2, 3, 45, 89};
    // Binary search: returns index of the search key
    System.out.println(Arrays.binarySearch(arr3, 45));
    // Binary Search within range: returns index of the search key
    System.out.println(Arrays.binarySearch(arr3, 0, 4, 3));

    Arrays.sort(arr1);
    Utility.printArray(arr1);
    /**
     * the binarySearch() method uses negative numbers to indicate insertion points. Since 0 is a
     * valid result for a successful search, the first available insertion point is -1. There- fore,
     * the actual insertion point is represented as (-(insertion point) -1)
     */
    System.out.println(Arrays.binarySearch(arr1, 90));

    String[] stringArray = {"one", "two", "three", "four"};
    Utility.printArray(stringArray);
    List<String> stringList = Arrays.asList(stringArray);
    System.out.println("size: " + stringList.size());
    System.out.println("item at index 2: " + stringList.get(2));
    stringList.set(3, "six");
    stringArray[1] = "five";
    // stringList.add("seven"); // Since this call is going to an abstract method add() of List
    // Interface it fails
    Utility.printArray(stringArray);
    System.out.println("sl[1] " + stringList.get(1));
  }

  public <T> void makeArrayList(T t) { // take an object of an
    // unknown type and use a
    // "T" to represent the type
    List<T> list = new ArrayList<T>(); // now we can create the
    // list using "T"
    list.add(t);
  }
}
