package MyPreparation.collectionsinjava.ListPrograms;

import utils.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
/** ArrayList is not synchronized. That means, multiple threads can use same ArrayList simultaneously.*/
public class ArrayListFunctions {
  public static void main(String[] args) {
    ArrayList<Integer> listOfIntegers1 = new ArrayList<>();
    listOfIntegers1.add(12);
    listOfIntegers1.add(40);
    listOfIntegers1.add(23);
    listOfIntegers1.add(4);
    System.out.println(listOfIntegers1);

    ArrayList<Integer> listOfIntegers2 = new ArrayList<>();
    listOfIntegers2.add(50);
    listOfIntegers2.add(60);
    listOfIntegers2.add(70);
    System.out.println(listOfIntegers2);

    ArrayList<String> listOfStrings = new ArrayList<>();
    listOfStrings.add("Nirmal");
    listOfStrings.add("Jason");
    listOfStrings.add("Brody");
    listOfStrings.add("Batman");
    listOfStrings.add("Robin");
    System.out.println(listOfStrings);

    System.out.println("Adding list2 to list1 at index 2:");
    listOfIntegers1.addAll(2, listOfIntegers2);
    System.out.println(listOfIntegers1);

    System.out.println("##########Cloning a list##########");
    ArrayList<Integer> list3 = (ArrayList<Integer>) listOfIntegers1.clone();
    System.out.println("Original list: " + listOfIntegers1);
    System.out.println("Cloned List: " + list3);
    System.out.println("Is list empty: " + listOfIntegers1.isEmpty());
    System.out.println("Does list contain the given element: " + listOfIntegers1.contains(3));
    System.out.println("Size of list: " + listOfIntegers1.size());
    // Since the return type of toArray() is an Object[], we need to hold the response in an
    // Object[]
    Object[] objectArrayFromList = listOfIntegers1.toArray();
    Utility.printArray(objectArrayFromList);
    // To get an Integer array from the list, use the below approach
    Integer[] integerArrayFromList = listOfIntegers1.toArray(new Integer[listOfIntegers1.size()]);
    Utility.printArray(integerArrayFromList);

    System.out.println("Remove element from list using Index: ");
    // We can't remove an element from an Integer list by using the element
    listOfIntegers1.remove(2);
    System.out.println(listOfIntegers1);
    System.out.println("Remove element from list using the element itself: ");
    // In String list we can use both remove methods
    listOfStrings.remove("Brody");
    listOfStrings.remove(1);
    System.out.println(listOfStrings);

    System.out.println("Add element at a particular index:");
    listOfIntegers1.add(2, 10);
    System.out.println(listOfIntegers1);

    System.out.println("Update value present at a index:");
    listOfIntegers1.set(2, 3);
    System.out.println(listOfIntegers1);

    System.out.println("Index of an element: " + listOfIntegers1.indexOf(4));
    System.out.println("Last index of an element: " + listOfIntegers1.lastIndexOf(4));

    // Different ways to loop a list
    /** 1. Java 7 ways */
    System.out.println("Using traditional for loop:");
    for (int i = 0; i < listOfIntegers1.size(); i++) {
      System.out.print(listOfIntegers1.get(i) + " ");
    }
    System.out.println();
    System.out.println("Using advanced for loop:");
    for (Integer i : listOfIntegers1) {
      System.out.print(i + " ");
    }
    System.out.println();
    // Using Iterator, we can traverse the elements only in forward direction.
    // Using Iterator, you can traverse List, Set and Queue type of objects.
    System.out.println("Using Iterator: ");
    Iterator iterator = listOfIntegers1.iterator();
    while (iterator.hasNext()){
      System.out.print(iterator.next()+" ");
    }
    System.out.println();
    //But, using ListIterator you can traverse the elements in both the directions – forward and backward
    System.out.println("Using ListIterator - Forward Direction: ");
    ListIterator listIterator = listOfIntegers1.listIterator();
    while (listIterator.hasNext()){
      System.out.print(listIterator.hasPrevious()+"|"+listIterator.previousIndex()+":"+listIterator.next()+":"+listIterator.nextIndex()+"|");
    }
    System.out.println();
    System.out.println("Using ListIterator - Backward Direction: ");
    while (listIterator.hasPrevious()){
      System.out.print(listIterator.hasNext()+"|"+listIterator.nextIndex()+":"+listIterator.previous()+":"+listIterator.previousIndex()+"|");
    }
    System.out.println();

    // Using ListIterator, you can iterate a list from the specified index. It is not possible with
    // Iterator.
    System.out.println("Iterating from particular index");
    ListIterator listIterator1 = listOfIntegers1.listIterator(2);
    while (listIterator1.hasNext()){
      System.out.print(listIterator1.next()+" ");
    }
    System.out.println();
    System.out.println("Using ListIterator - Modify Elements: ");
    while (listIterator.hasNext()){
      Integer i = (int)listIterator.next();
      listIterator.set(i+4);
    }
    System.out.println(listOfIntegers1);
    //listOfIntegers1.add(23); //ConcurrentModificationException

    System.out.println("Using Iterator - Remove Elements: (This doesn't work using ListIterator)");
    Iterator iterator1 = listOfIntegers1.iterator();
    while (iterator1.hasNext()){
      iterator1.next();
      iterator1.remove();
    }
    System.out.println(listOfIntegers1);

    System.out.println("Remove all the elements from list1 which are not present in list2:");
    listOfIntegers1.retainAll(listOfIntegers2);
    System.out.println(listOfIntegers1);

    System.out.println("Clearing list...");
    listOfIntegers1.clear();

    //adding array to a list
    Integer[] intArray = {12,34,65};
    listOfIntegers1.addAll(Arrays.asList(intArray));
    System.out.println(listOfIntegers1);
  }
}
