package MyPreparation.datastructures.ArrayPrograms;

public class FirstMaxSecondMax {

  public static void main(String[] args) {
    int[] arr = {50, 79, 10, 100, 45, 23, 69, 34};
    // int[] arr = {-2, 2, 2, 2, 2, 2, 2};
    FirstMaxSecondMax.printFirstAndSecondLargest(arr);
  }

  public static void printFirstAndSecondLargest(int[] arr) {
    int firstMax, secondMax;

    if (arr.length < 2) {
      System.out.print(" Invalid Input ");
    }
    // We need to start with the minimum integer value for -ve numbers
    firstMax = secondMax = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > firstMax) {
        secondMax = firstMax;
        firstMax = arr[i];
      } else if (arr[i] > secondMax
          && arr[i] != firstMax) { // the second condition here if the array has repeated elements
        secondMax = arr[i];
      }
    }
    System.out.println("1st largest: " + firstMax);
    System.out.println("2nd largest: " + secondMax);
  }
}
