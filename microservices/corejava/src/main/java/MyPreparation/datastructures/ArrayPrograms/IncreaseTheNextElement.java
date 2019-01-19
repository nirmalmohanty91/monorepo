package MyPreparation.datastructures.ArrayPrograms;

import utils.Utility;

public class IncreaseTheNextElement {

  public static void main(String[] args) {
    int[] a = {1, 2, 2, 3, 4, 4, 4}; // 1,2,3,4,5,6
    IncreaseTheNextElement.increaseTheNext(a);
    Utility.printArray(a);
  }

  public static void increaseTheNext(int[] a) {
    for (int i = 1; i < a.length; i++) {
      if (a[i - 1] == a[i]) {
        a[i] = a[i] + 1;
      }
    }
  }
}
