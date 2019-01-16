package MyPreparation.Java8.Java8Features;

import java.util.function.Predicate;

public class CheckingEvenUsingJava8 {

  public static void main(String[] args) {

    Predicate<Integer> predicate = i -> i % 2 == 0;

    System.out.println("Is 5 Event?: " + predicate.test(5));
  }
}
