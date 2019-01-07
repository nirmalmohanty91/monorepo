package utils;

import java.util.Arrays;

public class Utility {

  public static void printArray(int[] numbers, int i) {
    System.out.print("Loop " + i + ": ");
    Arrays.stream(numbers).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }

  public static void printArray(String[] arr) {
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }

  public static void printArray(int[] arr) {
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }
}
