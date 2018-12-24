package MyPreparation.datastructureprograms;

public class FrontBackSum {

  public static void main(String[] args) {
     //int[] arr = {3, 6, 1,12,80,9,102};
    int[] arr = {80, 67, 1, 2, 5,72};
    int frontSum = 0;
    int backSum = 0;
    int finalPointer = 0;
    for (int i = 0; i < arr.length; i++) {
      int p1 = i;
      int p2 = (arr.length - 1) - i;

      if (i == 0) {
        frontSum = arr[p1];
        backSum = arr[p2];
      }

      if (frontSum > backSum) {
        p2 = p2 - 1;
        backSum += arr[p2];
        finalPointer = p2 - 1;
      } else if (backSum > frontSum) {
        p1 = p1 + 1;
        frontSum += arr[p1];
        finalPointer = p1 + 1;
      } else {
        System.out.println(arr[finalPointer]);
        System.exit(0);
      }
    }
  }
}
