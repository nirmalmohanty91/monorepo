package MyPreparation.datastructures.ArrayPrograms;

import utils.Utility;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Segregate1sAnd0s {
  public static void main(String[] args) {
    int[] a = {1, 1, 1, 1, 1, 0, 0, 1, 0};
    Utility.printArray(segregate1sAnd0sJava8(a));
  }

  public static int[] segregate1sAnd0sJava8(int[] arr) {
    //Count number of zeros or ones
    int zeros = (int) Arrays.stream(arr).filter(x -> x == 0).count();

    IntStream.range(0, arr.length)
        .forEach(
            x -> {
              if (x < zeros) {
                arr[x] = 0;
              } else {
                arr[x] = 1;
              }
            });

    return arr;
  }

  public static int[] segregate1sAnd0sJava7(int[] arr) {
    int zeros = (int) Arrays.stream(arr).filter(x -> x == 0).count();
    for (int i = 0; i < arr.length; i++) {
      if (i < zeros) {
        arr[i] = 0;
      } else {
        arr[i] = 1;
      }
    }
    return arr;
  }
}
