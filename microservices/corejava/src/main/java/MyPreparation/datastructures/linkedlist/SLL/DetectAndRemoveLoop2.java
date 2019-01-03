package MyPreparation.datastructures.linkedlist.SLL;

public class DetectAndRemoveLoop2 {
  // Function that detects loop in the list
  public static int detectAndRemoveLoop(Node node) {
    Node slow = node;
    Node fast = node;

    while (slow != null && fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        removeLoop(slow, node);
        return 1;
      }
    }
    return 0;
  }

  // Function that removes loop
  private static void removeLoop(Node loop, Node curr) {
    Node ptr1;
    Node ptr2;

    // Set a pointer to the beginning of the linked list and move it one by one to find the first
    // node which is part of the Linked List
    ptr1 = curr;
    while (1 == 1) {
      // Now start a pointer from loop_node and check if it ever reaches ptr2
      ptr2 = loop;
      while (ptr2.next != loop && ptr2.next != ptr1) {
        ptr2 = ptr2.next;
      }
      /* If ptr2 reached ptr1 then there is a loop. So break the
      loop */
      if (ptr2.next == ptr1) {
        break;
      }

      /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
      ptr1 = ptr1.next;
    }

    /* After the end of loop ptr2 is the last node of the loop. So
    make next of ptr2 as NULL */
    ptr2.next = null;
  }
}
