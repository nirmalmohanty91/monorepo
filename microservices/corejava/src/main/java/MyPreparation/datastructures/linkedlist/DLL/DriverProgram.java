package MyPreparation.datastructures.linkedlist.DLL;

public class DriverProgram {
  static DLLNode head;

  public static void main(String[] args) {
    DriverProgram list = new DriverProgram();
    list.head = new DLLNode(10, null);
    list.head.next = new DLLNode(20, list.head);
    list.head.next.next = new DLLNode(30, list.head.next);

    DLLOperations.printDoublyLL(head);
  }
}
