package MyPreparation.datastructures.linkedlist.SLL;

public class DetectAndRemoveLoopFinal {
  public static void detectAndRemoveLoop(Node node) {
    Node slow = node;
    Node fast = node;

    if (node == null || node.next == null) {
      System.out.println("List is empty/Have only one element in it.");
      return;
    }

    slow = node.next;
    fast = fast.next.next;

    while (fast != null && fast.next != null) {
      if (slow == fast) break;
      slow = slow.next;
      fast = fast.next.next;
    }
    // If loop exists
    if (fast == slow) {
      System.out.println("Loop found. Removing...");
      slow = node;
      while (slow.next != fast.next) {
        fast = fast.next;
        slow = slow.next;
      }
      fast.next = null;
    }
  }
}
