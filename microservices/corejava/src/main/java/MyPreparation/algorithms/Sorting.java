package MyPreparation.algorithms;

public class Sorting {

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
   * This is not the best sorting algorithm in terms of performance. But it is little more efficient
   * than SELECTION SORT & BUBBLE SORT. The time complexity is O(n) for best case. There also can be
   * reverse sorted array, which will be the worst case scenario and the time complexity will be
   * O(n2)
   */
  public static int[] insertionSort(int[] numbers) {
    //Starting from index 1
    for (int i = 1; i < numbers.length; i++) {
      int value = numbers[i];
      int markerIndex = i;

      while (markerIndex > 0 && numbers[markerIndex - 1] > value) {
        numbers[markerIndex] = numbers[markerIndex - 1];
        markerIndex = markerIndex - 1;
      }
      numbers[markerIndex] = value;
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
   * O(nlog n): Worst case running time. O(n): In-terms of space complexity. Non in-place sorting
   */
  public static int[] mergeSort(int[] numbers) {
    int length = numbers.length;
    if (length < 2) {
      return numbers;
    }

    int mid = length / 2;
    int[] leftArray = new int[mid];
    int[] rightArray = new int[length - mid];

    for (int i = 0; i < mid; i++) {
      leftArray[i] = numbers[i];
    }

    for (int i = mid; i < length; i++) {
      rightArray[i - mid] = numbers[i];
    }
    mergeSort(leftArray);
    mergeSort(rightArray);

    return Sorting.merge(leftArray, rightArray, numbers);
  }

  /** This method takes two sorted arrays and merges them back to main array */
  private static int[] merge(int[] leftArray, int[] rightArray, int[] numbers) {

    int i = 0; // left array start index
    int j = 0; // right array start index
    int k = 0; // main array start index

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

  /**
   * O(nlog n): Average case running time. O(n2): Worst case running time(This can always avoided
   * using randomized version of QuickSOrt). This is an in-place sorting algorithm)
   */
  public static int[] quickSort(int[] numbers, int start, int end) {
    if (start < end) {
      int partitionIndex = Sorting.partition(numbers, start, end);
      quickSort(numbers, start, partitionIndex - 1);
      quickSort(numbers, partitionIndex + 1, end);
    }
    return numbers;
  }

  public static int partition(int[] array, int start, int end) {
    int pivot = array[end];
    int partitionIndex = start;

    for (int i = start; i < end; i++) {
      if (array[i] <= pivot) {
        int temp = array[i];
        array[i] = array[partitionIndex];
        array[partitionIndex] = temp;
        partitionIndex++;
      }
    }

    int temp = array[partitionIndex];
    array[partitionIndex] = array[end];
    array[end] = temp;
    return partitionIndex;
  }
}
