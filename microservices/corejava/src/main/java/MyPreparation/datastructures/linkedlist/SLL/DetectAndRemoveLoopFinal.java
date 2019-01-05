package MyPreparation.datastructures.linkedlist.SLL;

public class DetectAndRemoveLoopFinal {
  public static void detectAndRemoveLoop(Node head) {
    Node slow = head;
    Node fast = head;
    /** List is empty OR Have only one element in it without a loop. */
    if (head == null || head.next == null) {
      return;
    }

    /** Checking if loop exists */
    slow = head.next;
    fast = fast.next.next;
    while (fast != null && fast.next != null) {
      if (slow == fast) {
        break;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    /** Loop found. Removing... */
    if (fast == slow) {
      slow = head;
      while (slow.next != fast.next) {
        fast = fast.next;
        slow = slow.next;
      }
      /** Printing the starting node of the loop */
      System.out.println("Value in starting node of the loop: " + slow.next.data);
      fast.next = null;
    }
  }
}
