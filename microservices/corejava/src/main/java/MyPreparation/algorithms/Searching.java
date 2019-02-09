package MyPreparation.algorithms;

public class Searching {
  /** Takes O(n) time */
  public static boolean linearSearch(int[] array, int value) {
    // boolean found = false;
    for (int a : array) {
      if (a == value) {
        return true;
        // found = true;
        // break;
      }
    }
    return false;
  }
  /** Time complexity O(log n) */
  public static boolean binarySearch(int[] array, int value) {

    // boolean found = false;
    int lowerIndex = 0;
    int higherIndex = array.length - 1;

    while (lowerIndex < higherIndex) {
      int midIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
      if (value == array[midIndex]) {
        return true;
      } else if (value < array[midIndex]) {
        higherIndex = midIndex - 1;
      } else {
        lowerIndex = midIndex + 1;
      }
    }

    return false;
  }
}
