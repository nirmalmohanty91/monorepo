package MyPreparation.Java8.Java8Features;

import java.util.function.Function;

public class TransformationFrom7To8 {

  /** Java 7 way of writing code */
  /*
  public static int getSquare(int i) {
    return i * i;
  }
  */
  // The above code can be written in a single line using Function in java *

  public static void main(String[] args) {

    Function<Integer, Integer> function = i -> i * i;

    // System.out.println("Square of 5: " + getSquare(5));
    System.out.println("Square of 5: " + function.apply(5));
  }
}
