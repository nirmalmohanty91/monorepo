package MyPreparation.datastructures.linkedlist.SLL;

public class DriverProgram {
  static Node head;

  public static void main(String[] args) {
    // Inserting element to linked list
    DriverProgram.head = new Node(50);
    DriverProgram.head.next = new Node(20);
    DriverProgram.head.next.next = new Node(15);
    DriverProgram.head.next.next.next = new Node(4);
    DriverProgram.head.next.next.next.next = new Node(10);
    // Printing Linked List
    //    System.out.println("Linked List items before any operation: ");
    //    SinglyLinkedListOperations.printList(head);

    //    System.out.println("Reversing linked list");
    //    SinglyLinkedListOperations.printList(SinglyLinkedListOperations.reverse(head));
    // Creating a loop for testing
    head.next.next.next.next.next = head.next.next;

    //  Detecting and removing loop 1st Approach
    // System.out.println(
    //    DetectAndRemoveLoop1.detectAndRemoveLoop(head) == 1 ? "Loop detected and removed!" : "");
    //    System.out.println(DetectAndRemoveLoop1.class+" after removing loop : ");
    //    PrintLinkedList.printList(head);
    //
    //    // Creating a loop for testing
    //    head.next.next.next.next.next = head.next.next;
    //
    //    //Detecting and removing loop 2nd Approach

    System.out.println(
        DetectAndRemoveLoop2.detectAndRemoveLoop(head) == 1
            ? "Loop detected and removed!"
            : "Yo! No loop.");

    //    System.out.println(DetectAndRemoveLoop2.class+" after removing loop : ");
    //    PrintLinkedList.printList(head);
    //
    //    // Creating a loop for testing
    //    head.next.next.next.next.next = head.next.next;
    //
    //    // Detecting and removing loop Final Approach
    //    DetectAndRemoveLoopFinal.detectAndRemoveLoop(head);
    //    System.out.println(DetectAndRemoveLoopFinal.class+" after removing loop : ");
    //    PrintLinkedList.printList(head);
    //
    //    System.out.println("List at the beginning: ");
    //    PrintLinkedList.printList(head);
    //
    //    Node modifiedList = InsertIntoLinkedList.insertInLinkedList(head, 40, 1);
    //    System.out.println("After inserting data to the 1st position : ");
    //    PrintLinkedList.printList(modifiedList);

    //    Node insertInMiddle = InsertIntoLinkedList.insertInLinkedList(head, 80, 4);
    //    System.out.println("After inserting in middle : ");
    //    PrintLinkedList.printList(insertInMiddle);
    //
    //    System.out.println("Inserting at the end : ");
    //    Node insertAtEnd = InsertIntoLinkedList.insetAtEnd(head, 820);
    //    PrintLinkedList.printList(insertAtEnd);
    //        head = SinglyLinkedListOperations.deleteFirstNode(head);
    //        System.out.println("After deleting 1st node : ");
    //        SinglyLinkedListOperations.printList(head);
    //    head = SinglyLinkedListOperations.deleteFromPosition(head, 5);
    //    System.out.println("After from position node : ");
    //    SinglyLinkedListOperations.printList(head);
  }
}
