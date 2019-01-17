package MyPreparation.datastructures.ArrayPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueElements {

  public static void main(String[] args) {

    int[] arr = {21, 3, 4, 3, 21, 54, 4, 6, 6, 54};
    System.out.println(arr.length);
    // UniqueElements.printUniqueElements(arr);
    // System.out.println();
    // UniqueElements.printUniqueElementsBySorting(arr);
    System.out.println("Using HashTable(HashMap/HashSet): ");
    // UniqueElements.printUniqueElmentsUsingHashSet(arr);
    UniqueElements.printUniqueElmentsUsingHashMap(arr);
  }
  /** O(n2) */
  public static void printUniqueElements(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j;
      for (j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          break;
        }
      }
      if (i == j) {
        System.out.print(arr[i] + " ");
      }
    }
  }
  /** O(nlogn) */
  public static void printUniqueElementsBySorting(int[] arr) {
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      while ((i < arr.length - 1) && arr[i] == arr[i + 1]) {
        i++;
      }
      System.out.print(arr[i] + " ");
    }
  }
  /** O(n) */
  public static void printUniqueElmentsUsingHashSet(int[] arr) {
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i : arr) {
      if (!hashSet.contains(i)) {
        System.out.print(i + " ");
        hashSet.add(i);
      }
    }
  }
  /** O(n) */
  public static void printUniqueElmentsUsingHashMap(int[] arr) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i : arr) {
      if (!hashMap.containsKey(i)) {
        System.out.print(i + " ");
        hashMap.put(i, 1);
      }
    }
    System.out.println(hashMap);
  }
}
