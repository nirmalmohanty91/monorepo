package MyPreparation.Java8concepts;

import java.util.Arrays;
import java.util.stream.Stream;

public class Java8Flatmap1 {
  public static void main(String[] args) {
    String[][] stringArray = new String[][] {{"a", "b"}, {"c", "d"}, {"e", "f"}};

    System.out.println(stringArray.length);
    System.out.println(stringArray[0][1]);

    // Stream<String[]>
    Stream<String[]> stream = Arrays.stream(stringArray);

    // Convert Stream<String[]> to Stream<String>
    // Stream<String> stringStream = stream.flatMap(x -> Arrays.stream(x));
    // Can also be written as
    Stream<String> stringStream = stream.flatMap(Arrays::stream);

    // Filter a stream of string
    Stream<String> filteredStream = stringStream.filter(x -> x.equalsIgnoreCase("c"));

    filteredStream.forEach(System.out::println);
  }
}
