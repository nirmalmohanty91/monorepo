package MyPreparation.datastructureprograms;

import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[] numbers = {12, 9, 32, 11, 89, 2, 4};

    for (int i = 0; i < numbers.length / 2; i++) {
      int other = (numbers.length - 1) - i;
      // swapping
     /**
      int temp = numbers[other];
      numbers[other] = numbers[i];
      numbers[i] = temp;
      */
      // OR
      numbers[other] = numbers[other] + numbers [i];
      numbers[i] = numbers[other]  - numbers[i];
      numbers[other] = numbers[other] - numbers[i];

    }

    Arrays.stream(numbers).forEach(a -> System.out.print(a + " "));
  }
}
