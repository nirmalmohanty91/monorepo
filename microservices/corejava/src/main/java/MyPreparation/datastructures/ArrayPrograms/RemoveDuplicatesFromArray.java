package MyPreparation.datastructures.ArrayPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

  public static void main(String[] args) {

    int[] arr = {21, 3, 10, 4, 3, 3, 21, 54, 4, 6, 6, 6, 54, 54, 54, 54, 54, 54};
    // System.out.println(arr.length);
    // PrintUniqueElements.printUniqueElements(arr);
    // System.out.println();
    RemoveDuplicatesFromArray.printUniqueElementsBySorting(arr);
    // System.out.println("Using HashTable(HashMap/HashSet): ");
    // PrintUniqueElements.printUniqueElmentsUsingHashSet2(arr);
    // PrintUniqueElements.printUniqueElmentsUsingHashMap2(arr);
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
  public static void printUniqueElmentsUsingHashSet2(int[] arr) {
    // The below line would have worked if we could have an array of Integers not integers
    // HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
    // Now lets convert the int array to list of Integers
    HashSet<Integer> hashSet =
        new HashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    System.out.println(hashSet);
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
  /** O(n) */
  static void printUniqueElmentsUsingHashMap2(int[] arr) {

    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i : arr) {
      hashMap.putIfAbsent(i, 1);
    }
    System.out.println(hashMap.keySet());
  }
  /** O(n) */
  static void printUniqueElmentsUsingHashMap3(int arr[]) {

    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i : arr) {
      if (hashMap.containsKey(i)) {
        hashMap.put(i, hashMap.get(i) + 1);
      } else {
        hashMap.put(i, 1);
      }
    }
    hashMap
        .entrySet()
        .stream()
        .filter(x -> x.getValue() == 1)
        .forEach(x -> System.out.println(x.getKey()));
  }


}
