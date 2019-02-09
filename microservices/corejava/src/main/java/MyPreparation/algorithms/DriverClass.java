package MyPreparation.algorithms;

public class DriverClass {

  public static void main(String[] args) {
    // --------------------SORTING-------------------

    // int[] numbers = new int[] {12, 89, 1, 67, 5, 23};
    // int[] numbers = {12, 89, 1, 67, 5, 23};
    int[] numbers = {2, 7, 1, 6, 8, 5, 3, 4};

    int[] numbers1 = {1, 2, 3};
    // Sorting.mergeSort(numbers);

    // Quick Sort
    // for (int i : Sorting.quickSort(numbers, 0, numbers.length - 1)) System.out.print(i + " ");

    // ------------------SEARCHING-------------------

    int[] intArray = {78, 32, 12, 98, 67};
    // System.out.println(Searching.linearSearch(intArray, 78));
    // For Binary Search the input array should be a sorted one;
    int[] sortedArray = Sorting.bubbleSort1(intArray);
    System.out.println(Searching.binarySearch(sortedArray, 120));
  }
}
