package MyPreparation.algorithms;

// Takes O(n) time

public class Searching {

  public static void main(String[] args) {
    int[] intArray = {78, 32, 12, 98, 67};
     System.out.println(Searching.linearSearch(intArray, 78));
    // For Binary Search the input array should be a sorted one;
    int[] sortedArray = Sorting.bubbleSort1(intArray);
    System.out.println(Searching.binarySearch(sortedArray, 780));
  }

  public static boolean linearSearch(int[] array, int value) {
    boolean found = false;
    for (int a : array) {
      if (a == value) {
        found = true;
        break;
      }
    }
    return found;
  }

  public static boolean binarySearch(int[] array, int value) {

    boolean found = false;
    int lowerIndex = 0;
    int higherIndex = array.length - 1;
    while (lowerIndex < higherIndex) {
      int midIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
      if (value == array[midIndex]) {
        found = true;
        break;
      } else if (value < array[midIndex]) {
        higherIndex = midIndex - 1;
      } else {
        lowerIndex = midIndex + 1;
      }
    }

    return found;
  }
}
