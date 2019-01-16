package MyPreparation.Java8.Java8Features;

import java.util.Arrays;
import java.util.function.Predicate;

public class $6Java8Predicate {

  public static void main(String[] args) {
    // Check if the length of the string is greater that 5
    String name = "Nirmal Mohanty";
    Predicate<String> lengthCheck = s -> s.length() > 5;
    System.out.println(lengthCheck.test(name));
    System.out.println("list strings whose length is more that 5:");
    String actors[] = {"Scarlet", "Christian", "Zlatan", "Rooney", "Messi"};
    Arrays.stream(actors)
        .forEach(
            a -> {
              if (lengthCheck.test(a)) {
                System.out.println(a);
              }
            });
    int numbers[] = {45, 34, 65, 12, 0, 9, 6, 5, 1, 43, 98};

    Predicate<Integer> p1 = n -> n % 2 == 0;
    Predicate<Integer> p2 = n -> n > 10;
    System.out.println("Filter numbers greater than 10 and even:");
    Arrays.stream(numbers)
        .forEach(
            a -> {
              if (p1.and(p2).test(a)) {
                System.out.println(a);
              }
            });

    System.out.println("Filter numbers greater than 10 or even:");
    Arrays.stream(numbers)
        .forEach(
            a -> {
              if (p1.or(p2).test(a)) {
                System.out.println(a);
              }
            });

    System.out.println("Even numbers:");
    Arrays.stream(numbers)
        .forEach(
            a -> {
              if (p1.test(a)) {
                System.out.println(a);
              }
            });
    System.out.println("Odd numbers:");

    Arrays.stream(numbers)
        .forEach(
            a -> {
              if (p1.negate().test(a)) {
                System.out.println(a);
              }
            });
  }
}
