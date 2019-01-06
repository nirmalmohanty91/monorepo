package MyPreparation.algorithms;

public class DriverClass {

  public static void main(String[] args) {
    // --------------------SORTING-------------------

    // int[] numbers = new int[] {12, 89, 1, 67, 5, 23};
    int[] numbers = {12, 89, 1, 67, 5, 23};
    int[] numbers1 = {1,2,3};
    //Sorting.insertionSort(numbers);

    // Quick Sort
    for (int i : Sorting.quickSort(numbers, 0, numbers.length - 1)) System.out.print(i + " ");

    // ------------------SEARCHING-------------------

    int[] intArray = {78, 32, 12, 98, 67};
    //System.out.println(Searching.linearSearch(intArray, 78));
    // For Binary Search the input array should be a sorted one;
    //int[] sortedArray = Sorting.bubbleSort1(intArray);
    //System.out.println(Searching.binarySearch(sortedArray, 780));
  }
}
