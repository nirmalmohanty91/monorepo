package MyPreparation.Java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StreamsAPIDemo {

  public static void main(String[] args) {

    ArrayList<Integer> integerArrayList =
        new ArrayList<>(Arrays.asList(100, 1, 13, 13, 4, 4, 62, 5, 6, 2, 1, 9, 9));

    System.out.println("Size of list: " + integerArrayList.size());
    System.out.println(
        "Number of unique elements in list: " + integerArrayList.stream().distinct().count());

    System.out.println("Creating stream: ");
    String[] arr = new String[] {"a", "b", "c"};
    Stream<String> stream = Arrays.stream(arr);
    stream.forEach(System.out::print);
    System.out.println();

    Stream<String> stream1 = Stream.of("e", "f", "g");
    stream1.forEach(System.out::print);
    System.out.println();
    System.out.println("Multi-threading with Streams: ");
    // The code below allows to run method doWork() in parallel for every element of the stream:
    // list.parallelStream().forEach(element -> doWork(element));
    System.out.println("Iterating:");
    System.out.println(
        "If list contains: " + integerArrayList.stream().anyMatch(element -> element == 62));

    System.out.println("Filtering:");
    ArrayList<String> list = new ArrayList<>();
    list.add("One");
    list.add("OneAndOnly");
    list.add("Derek");
    list.add("Change");
    list.add("factory");
    list.add("justBefore");
    list.add("Italy");
    list.add("Italy");
    list.add("Thursday");
    list.add("");
    list.add("");

    Stream<String> stream2 =
        list.stream().filter(element -> element.contains("d") || element.contains("D"));
    stream2.forEach(x -> System.out.print(x + " "));

    System.out.println("Encounter Order of Collection sources:");
    /**
     * The elements in TreeSet are sorted according to specified Comparator. If no Comparator is
     * specified, elements will be placed according to their natural ascending order.
     */
    List<String> list2 = Arrays.asList("B", "A", "C", "D", "F");
    Set<String> set = new TreeSet<>(list2);
    System.out.println(list2);
    System.out.println(set);

    Object[] listOutput = list2.stream().toArray();
    Object[] setOutput = set.stream().toArray();

    Arrays.stream(listOutput).forEach(x -> System.out.print(x + " "));
    System.out.println();
    Arrays.stream(setOutput).forEach(x -> System.out.print(x + " "));
    System.out.println();
  }
}
