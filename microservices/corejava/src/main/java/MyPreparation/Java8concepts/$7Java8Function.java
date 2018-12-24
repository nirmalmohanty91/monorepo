package MyPreparation.Java8concepts;

import java.util.function.Function;

public class $7Java8Function {

  public static void main(String[] args) {

    Function<Integer, Integer> square = i -> i * i;
    System.out.println("Square of 8 is: " + square.apply(8));

    Function<String, Integer> stringLength = s -> s.length();
    System.out.println("Length of \"Nirmal\" is: " + stringLength.apply("Nirmal"));

    Function<String, String> upperCase = s -> s.toUpperCase();
    System.out.println("Upper case of \"camel\" is: " + upperCase.apply("camel"));

    Function<Integer, Integer> f1 = i -> 2 * i;
    Function<Integer, Integer> f2 = i -> i * i * i;

    System.out.println("Function chaining: " + f1.andThen(f2).apply(2));
    System.out.println("Function chaining: " + f2.andThen(f1).apply(2));
    System.out.println("Function chaining: " + f1.compose(f2).apply(2));
    System.out.println("Function chaining: " + f2.compose(f1).apply(2));
  }
}
