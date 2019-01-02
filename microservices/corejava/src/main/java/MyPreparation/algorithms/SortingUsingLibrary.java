package MyPreparation.algorithms;

import java.util.Arrays;

public class SortingUsingLibrary {

  public static void printArray(int[] arr) {
    /** for (int i : arr) { System.out.print(i + " "); } */
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
  }

  public static void main(String[] args) {
    int[] numbers = {1, 44, 2, 449, 6, 433};
    SortingUsingLibrary.printArray(numbers);
    System.out.println();
    Arrays.sort(numbers);
    SortingUsingLibrary.printArray(numbers);
  }
}
