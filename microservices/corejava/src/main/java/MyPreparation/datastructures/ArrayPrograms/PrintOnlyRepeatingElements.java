package MyPreparation.datastructures.ArrayPrograms;

import java.util.HashMap;

public class PrintOnlyRepeatingElements {
  public static void main(String[] args) {
    int[] arr = {100,21, 3, 10, 4, 3, 3, 21, 54, 4, 6, 6, 6, 54, 54, 54, 54, 54, 54};
    // int arr[] = {1, 2, 3, 1, 3, 6, 6};

    PrintOnlyRepeatingElements.printRepeating2(arr, arr.length);
  }

  /** O(n2) */
  static void printRepeating1(int arr[], int size) {

    int previousElementPrinted = 0;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j <= i; j++) {
        if ((arr[i] == arr[j]) && (i != j) && (previousElementPrinted != arr[i])) {
          previousElementPrinted = arr[i];
          System.out.println(arr[i]);
          break;
        }
      }
    }
  }

  static void printRepeating2(int arr[], int size) {

    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i : arr) {
      if (hashMap.containsKey(i)) {
        hashMap.put(i, hashMap.get(i) + 1);
      } else {
        hashMap.put(i, 1);
      }
    }
    hashMap.entrySet().stream().filter(x -> x.getValue() > 1).forEach(x -> System.out.println(x.getKey()));
  }
}
