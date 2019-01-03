package MyPreparation.algorithms;

public class Searching {
  /** Takes O(n) time */
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
/**Time complexity O(log n)*/
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
