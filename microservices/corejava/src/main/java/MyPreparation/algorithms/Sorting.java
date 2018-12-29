package MyPreparation.algorithms;

import java.util.Arrays;

public class Sorting {

  public static void main(String[] args) {
    // int[] numbers = new int[] {12, 89, 1, 67, 5, 23};
    int[] numbers = {12, 89, 1, 67, 5, 23};

    for (int i : Sorting.mergeSort(numbers)) System.out.print(i + " ");
  }

  /**
   * The time complexity of this algorithm is O(n2) Bubble sort is in place and stable sorting
   * algorithm. This is worst case example
   */
  public static int[] bubbleSort1(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length - 1; j++) {
        if (numbers[j] > numbers[j + 1]) {
          int temp = numbers[j + 1];
          numbers[j + 1] = numbers[j];
          numbers[j] = temp;
        }
      }
    }
    return numbers;
  }
  /** The time complexity of this algorithm is O(n2). This is average case example */
  public static int[] bubbleSort2(int[] numbers) {

    for (int j = 0; j < numbers.length; j++) {
      // Since the highest element will be placed at the end of array the 2nd loop can be limited
      // further
      for (int i = 0; i < numbers.length - j - 1; i++) {
        if (numbers[i] > numbers[i + 1]) {
          int temp = numbers[i + 1];
          numbers[i + 1] = numbers[i];
          numbers[i] = temp;
        }
      }
    }
    return numbers;
  }

  /** The time complexity of this algorithm is O(n). This is Best case example */
  public static int[] bubbleSort3(int[] numbers) {
    for (int j = 0; j < numbers.length; j++) {
      boolean isSorted = true;
      for (int i = 0; i < numbers.length - j - 1; i++) {
        if (numbers[i] > numbers[i + 1]) {
          int temp = numbers[i + 1];
          numbers[i + 1] = numbers[i];
          numbers[i] = temp;
          isSorted = false;
        }
      }
      if (isSorted) {
        break;
      }
    }
    return numbers;
  }

  /**
   * This is not the best sorting algorithm in terms of performance But it is little more efficient
   * than selection sort and bubble sort The time complexity is O(n) for best case There also can be
   * reverse sorted array, which will be the worst case scenario and the time complexity will be
   * O(n2)
   */
  public static int[] insertionSort(int[] numbers) {

    for (int i = 1; i < numbers.length; i++) {
      int value = numbers[i];
      int hole = i;

      while (hole > 0 && numbers[hole - 1] > value) {
        numbers[hole] = numbers[hole - 1];
        hole = hole - 1;
      }
      numbers[hole] = value;
    }
    return numbers;
  }

  /** The time complexity of this algorithm is O(n2) Selection sort is the slow sorting algorithm */
  public static int[] selectionSort(int[] numbers) {

    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] < numbers[i]) {
          int temp = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = temp;
        }
      }
    }
    return numbers;
  }

  /**
   *
   * @param numbers
   * @return
   */
  public static int[] mergeSort(int[] numbers) {
    int length = numbers.length;
    if (length < 2) {
      return numbers;
    }

    int mid = length / 2;
    int[] leftArray = new int[mid];
    int[] rightArray = new int[length - mid];

    for (int i = 0; i < mid ; i++) {
      leftArray[i] = numbers[i];
    }

    for (int i = mid; i < length; i++) {
      rightArray[i - mid] = numbers[i];
    }

    Sorting.mergeSort(leftArray);
//    System.out.println("After recursion call of left array...");
//    Arrays.stream(leftArray).forEach(System.out::println);
    Sorting.mergeSort(rightArray);
    //    System.out.println("After recursion call of right array...");
    //    Arrays.stream(rightArray).forEach(System.out::println);

    return Sorting.merge(leftArray, rightArray, numbers);
  }

  /**
   * This method takes two sorted arrays and merges them back to main array
   * @param leftArray
   * @param rightArray
   * @param numbers
   * @return numbers merged array
   */
  private static int[] merge(int[] leftArray, int[] rightArray, int[] numbers) {

    int i = 0; //left array start index
    int j = 0; //right array start index
    int k = 0; //main array start index

    while (i < leftArray.length && j < rightArray.length) {
      if (leftArray[i] <= rightArray[j]) {
        numbers[k] = leftArray[i];
        i++;
      } else {
        numbers[k] = rightArray[j];
        j++;
      }
      k++;
    }

    while (i < leftArray.length) {
      numbers[k] = leftArray[i];
      i++;
      k++;
    }

    while (j < rightArray.length) {
      numbers[k] = rightArray[j];
      j++;
      k++;
    }

    return numbers;
  }
}
