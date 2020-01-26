package MyPreparation.Java8.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class MethodReference {

  public static void main(String[] args) {

    List<String> greetings = Arrays.asList("hello", "hi", "welcome", "bye");

    // Method1: Without Lambda Using functional Interface
    Consumer<String> consumer1 =
        new Consumer<String>() {
          @Override
          public void accept(String s) {
            System.out.println(s);
          }
        };
    // This indicates Consumer has a method which takes only 1 argument and doesn't return anything
    // Signature of the lambda expression matches with the signature of the Interface. That's all it
    // matters
    Consumer<String> consumer2 = greet -> System.out.println(greet);
    // Functional Interface should have only one method
    MyCustomLambda consumer3 = greet -> System.out.println(greet);

    greetings.forEach(consumer1);
    greetings.forEach(consumer2);

    // Method2: With Lambda using functional interface
    greetings.forEach(greet -> System.out.println(greet));
  }
}

@FunctionalInterface
interface MyCustomLambda {
  public void yo(String s);
}
