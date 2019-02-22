package interviewquestions.DBS;

import utils.Utility;

public class PlaceNegativesLeft {
  public static void main(String[] args) {
    int[] a = {-1, 2, -3, 18, 7, -2};

    int pivot = 0;
    int partionIndex = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] < pivot) {
        int temp = a[i];
        a[i] = a[partionIndex];
        a[partionIndex] = temp;
        partionIndex++;
      }
    }
    Utility.printArray(a);
  }
}
