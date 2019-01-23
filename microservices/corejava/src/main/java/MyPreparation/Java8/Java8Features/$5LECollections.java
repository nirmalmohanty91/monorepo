package MyPreparation.Java8.Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/** Sorting a list using java 7 way & then converting the same to use LE */
/**
 * Please remember that java 8 has a feature to sort the list directly list.sort() by passing the
 * comparator
 */
// Java 7 way
/*
class MyComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer o1, Integer o2) {
    return o1 - o2;
  }
}
*/
public class $5LECollections {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(45);
    numbers.add(10);
    numbers.add(30);
    numbers.add(5);
    numbers.add(11);
    // Java 7 way
    /*
    Collections.sort(numbers, new MyComparator());
    */
    /*
        Comparator<Integer> myComparator = (a, b) -> a - b;
        Collections.sort(numbers, myComparator);
    */
    // Further concise code
    /*
        Collections.sort(numbers, (a, b) -> a - b);
    */
    /*
    numbers.sort(Comparator.naturalOrder());
    */
    // Another way to sort. Awesome :)
   // Comparator<Integer> myComparator = Comparator.comparingInt(Integer::intValue);
    Comparator<Integer> myComparator = Comparator.comparingInt(x->x.intValue());

    System.out.println(numbers);

    numbers.stream().forEach(System.out::println);

    List<Integer> evenList = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());


    System.out.println(evenList);
  }
}
