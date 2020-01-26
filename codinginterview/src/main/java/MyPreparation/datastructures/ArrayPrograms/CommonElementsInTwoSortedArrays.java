package MyPreparation.datastructures.ArrayPrograms;

import MyPreparation.algorithms.Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElementsInTwoSortedArrays {
  public static void main(String[] args) {
    int[] a1 = {1, 3, 4, 6, 7, 9};
    int[] b1 = {1, 2, 4, 5, 9, 10};

    int[] a2 = {1, 2, 9, 10, 11, 12};
    int[] b2 = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};

    int[] a3 = {};
    int[] b3 = {};
    Arrays.stream(CommonElementsInTwoSortedArrays.commonElements3(a1, b1))
        .forEach(x -> System.out.print(x + " "));
  }
  /** Takes O(m*n) time where m is length of a and n is length of b */
  public static Integer[] commonElements1(int[] a, int[] b) {
    List<Integer> list = new ArrayList<>();
    /** O(m) */
    for (int i = 0; i < a.length; i++) {
      /** O(n) */
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          list.add(a[i]);
          break;
        }
      }
    }
    Integer[] arr = new Integer[list.size()];
    return list.toArray(arr);
  }

  /** put one array in dictionary and the loop the other one Solution in O(m + n) */
  public static Integer[] commonElements2(int[] a, int[] b) {

    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    /** This operation takes O(n) time */
    for (int element : a) {
      if (map.containsKey(element)) {
        /** This takes O(1) */
        map.put(element, map.get(element) + 1);
      } else {
        map.put(element, 1);
      }
    }
    /** This takes O(m) time */
    for (int element : b) {
      if (map.containsKey(element)) {
        list.add(element);
      }
    }

    Integer[] arr = new Integer[list.size()];
    return list.toArray(arr);
  }

  /** use binary search to find element in another array Solution in O(m * log n) */
  public static Integer[] commonElements3(int[] a, int[] b) {
    List<Integer> list = new ArrayList<>();
    /** O(m) */
    for (int element : a) {
      /** O(log n) */
      if (Searching.binarySearch(b, element)) {
        list.add(element);
      }
    }
    Integer[] arr = new Integer[list.size()];
    return list.toArray(arr);
  }
}
