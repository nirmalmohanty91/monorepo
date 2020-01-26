package MyPreparation.ExploringUtilClassInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExploringCollectionsUtil {
  public static void main(String[] args) {
    Integer[] intArray = {100,200,300};
    List<Integer> list = new ArrayList<>(Arrays.asList(80, 67, 16, 35, 3, 1, 5, 2, 3));
    list.add(10);
    list.remove(0);
    // Add Array to list
    Collections.addAll(list,intArray);

    System.out.println(list);
    // Find Max value
    System.out.println(Collections.max(list));
    // Find Min value
    System.out.println(Collections.min(list));
    // Sorting List
    Collections.sort(list);
    System.out.println(list);
    // Shuffling list
    Collections.shuffle(list);
    System.out.println(list);
    // Checking frequency of an element
    System.out.println("Frequency of 3 in list is " + Collections.frequency(list, 3));
    // Reversing a list
    Collections.reverse(list);
    System.out.println(list);
    // Swapping elements
    Collections.swap(list, 3, 5);
    System.out.println(list);
    // Synchronize List
    Collections.synchronizedList(list);
    // Unmodifiable list
    List<Integer> list1 = Collections.unmodifiableList(list);
    //list1.add(12); // Collections$UnmodifiableCollection
    System.out.println(list1);
  }
}
