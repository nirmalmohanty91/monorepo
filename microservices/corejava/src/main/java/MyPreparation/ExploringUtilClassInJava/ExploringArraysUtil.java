package MyPreparation.ExploringUtilClassInJava;

import utils.Utility;

import java.util.Arrays;

public class ExploringArraysUtil {
  public static void main(String[] args) {
    int[] arr1 = {80, 67, 16, 16, 3, 1, 5, 2};
    int[] arr2 = {80, 67, 16, 3, 1, 2, 1};
    // Sorted array
    int[] arr3 = {1, 2, 3, 45, 89};

    // Sorting elements from one index to another
    Arrays.sort(arr1, 1, 5);
    Utility.printArray(arr1);
    // Comparing two arrays
    System.out.println(Arrays.equals(arr1, arr2));
    // String representation of an array
    System.out.println(Arrays.toString(arr1));
    // Binary search: returns index of the search key
    System.out.println(Arrays.binarySearch(arr3, 45));
    // Binary Search within range: returns index of the search key
    System.out.println(Arrays.binarySearch(arr3, 0, 4, 3));

  }
}
