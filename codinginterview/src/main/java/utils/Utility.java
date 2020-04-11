package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

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

  public static void printArray(boolean[] arr) {
    IntStream.range(0,arr.length).forEach(i -> System.out.print(arr[i]+ " "));
    System.out.println();
  }

  public static void printArray(int[] arr) {
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }

  public static void printArray(Integer[] arr) {
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }

  public static void printArray(Object[] arr) {
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }

  public static ArrayList<String> sortAlphabetically(ArrayList<String> list) {
    Collections.sort(list);
    return list;
  }

  public static ArrayList<String> reverseList(ArrayList<String> list) {
    Collections.reverse(list);
    return list;
  }

  public static ArrayList<String> getList() {
    System.out.println("Generating list....");
    ArrayList<String> marvelUniverse =
        new ArrayList<>(Arrays.asList("Hawk Eye", "Falcon", "Spider Man"));
    return marvelUniverse;
  }

  public static ArrayList<String> getAnotherList() {
    System.out.println("Generating Another list for java 8 demo....");
    ArrayList<String> marvelUniverse =
        new ArrayList<>(Arrays.asList("Venom", "Black Widow", "Scarlet Witch"));
    return marvelUniverse;
  }
}
