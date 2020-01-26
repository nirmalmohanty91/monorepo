package MyPreparation.collectionsinjava.ListPrograms;

import java.util.LinkedList;

public class LinkedListFunctions {
  public static void main(String[] args) {

    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Second");
    linkedList.add("Third");
    linkedList.addLast("Adding at Last");
    linkedList.offerLast("offering last");
    linkedList.offer("Just offer");
    System.out.println(linkedList);
    System.out.println("Insert at beginning of the list:");
    linkedList.addFirst("First");
    System.out.println(linkedList);
    System.out.println("Insert at the end of the list:");
    linkedList.addLast("Fourth");
    System.out.println(linkedList);
    System.out.println("Insert at particular index: ");
    linkedList.add(2,"Between");
    System.out.println(linkedList);
    System.out.println(linkedList.peek());
    System.out.println(linkedList.getFirst());
    System.out.println(linkedList.element());
    System.out.println(linkedList.peekFirst());

    System.out.println(linkedList.getLast());
    System.out.println(linkedList.peekLast());
    linkedList.add("First");
    System.out.println(linkedList);
    linkedList.removeFirstOccurrence("First");
    System.out.println(linkedList);
    linkedList.removeLastOccurrence("First");
    System.out.println(linkedList);
    System.out.println("Using Linked list as a Stack:(LIFO) ");
    System.out.println("-----------------------------");
    linkedList.push("Stack Element");
    System.out.println(linkedList);
    linkedList.pop();
    System.out.println(linkedList);
    System.out.println("Using Linked list as a Queue:(FIFO) ");
    System.out.println("-----------------------------");
    linkedList.offer("Queue Element");
    System.out.println(linkedList);
    linkedList.poll();
    System.out.println(linkedList);
  }
}
