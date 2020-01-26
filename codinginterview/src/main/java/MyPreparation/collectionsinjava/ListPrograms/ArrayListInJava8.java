package MyPreparation.collectionsinjava.ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListInJava8 {
  public static void main(String[] args) {
    ArrayList<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(12, 40, 23, 4, 7, 9, 6, 7));
    ArrayListInJava8.iterateListUsingIndex(listOfIntegers);
    ArrayListInJava8.loopingInJava8(listOfIntegers);
  }
  // Question: Give me a list of elements from the original list with odd indexed values multiplied
  // by 2
  public static void iterateListUsingIndex(List<Integer> list) {
//    List<Integer> filteredList =
//        IntStream.range(0, list.size())
//            .filter(i -> i % 2 != 0)
//            .mapToObj(i -> (Integer) list.toArray()[i] * 2)
//            .collect(Collectors.toList());
    List<Integer> filteredList =
            IntStream.range(0, list.size())
                    .filter(i -> i % 2 != 0)
                    .mapToObj(i -> list.get(i) * 2)
                    .collect(Collectors.toList());
    System.out.println(filteredList);
  }

  public static void loopingInJava8(List<Integer> list) {
    System.out.println("Looping happens in order: ");
    list.forEach(x -> System.out.print(x + " "));

    System.out.println("\nLooping happens randomly: ");
    list.stream().forEach(x -> System.out.print(x + " "));

    System.out.println("\nGuarantee ordering of streams elements: ");
    list.stream().forEachOrdered(x -> System.out.print(x + " "));

    System.out.println("\nDoesn't guarantee ordering: ");
    list.stream().parallel().forEach(x -> System.out.print(x + " "));

    System.out.println("\nDoesn't guarantee ordering: ");
    list.parallelStream().forEach(x -> System.out.print(x + " "));


  }
}
