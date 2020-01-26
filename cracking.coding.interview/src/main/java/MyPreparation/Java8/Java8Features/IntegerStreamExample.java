package MyPreparation.Java8.Java8Features;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntegerStreamExample {
  public static void main(String[] args) {
    int[] numbers = {12, 4, 3, 7, 8, 3, 7};
    int i = IntStream.of(numbers).min().getAsInt();
    System.out.println(i);
    IntStream.of(numbers).min().ifPresent(System.out::println);
    System.out.println("Max value: " + IntStream.of(numbers).max().getAsInt());
    IntStream.of(numbers).average().getAsDouble();

    IntSummaryStatistics statistics = IntStream.of(numbers).summaryStatistics();
    System.out.println(statistics);

    // Get the first 3 smallest unique elements in the array
    int[] numbers1 = {12, 4, 3, 7, 8, 3, 7, 4, 8, 8};
    IntStream.of(numbers1).distinct().sorted().limit(3).forEach(System.out::println);
  }
}
