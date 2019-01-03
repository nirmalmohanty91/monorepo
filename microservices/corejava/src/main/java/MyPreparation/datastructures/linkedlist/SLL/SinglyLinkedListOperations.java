package MyPreparation.datastructures.linkedlist.SLL;

class SinglyLinkedListOperations {
  /** INSERT */
  public Node insertInLinkedList(Node head, int data, int position) {
    int k = 1;
    Node ptr1 = null;
    Node ptr2 = null;
    Node newNode = new Node(data);
    ptr1 = head;
    // Inserting data at the beginning of the list
    if (position == 1) {
      newNode.next = ptr1;
      head = newNode;
    } else {
      // Traverse the list until the position where we want to insert
      while ((ptr1 != null) && position > k) {
        k++;
        ptr2 = ptr1;
        ptr1 = ptr1.next;
      }
      ptr2.next = newNode;
      newNode.next = ptr1;
    }

    return head;
  }
  // Insert at the end
  public Node insetAtEnd(Node head, int data) {
    Node newNode = new Node(data);
    if (head == null) return newNode;
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
    return head;
  }
  // Method to print the linked list
  public static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }
  /** DELETE */
  // Deleting Fist node
  public static Node deleteFirstNode(Node head) {
    if (head == null || head.next == null)
      System.out.println("List is empty/Only one element is present");
    head = head.next;
    return head;
  }
  // Deleting the las node
  public static Node deleteLastNode(Node head) {
    if (head == null || head.next == null)
      System.out.println("List is empty/Only one element is present");

    Node ptr1 = head;
    Node ptr2 = null;
    while (ptr1.next != null) {
      ptr2 = ptr1;
      ptr1 = ptr1.next;
    }
    ptr2.next = null;
    return head;
  }
  // Deleting from middle
  public static Node deleteFromPosition(Node head, int position) {
    if (head == null || head.next == null)
      System.out.println("List is empty/Only one element is present");
    if (position == 1) {
      return head = deleteFirstNode(head);

    } else {
      Node ptr1 = head;
      Node ptr2 = null;
      int k = 1;

      while (ptr1.next != null && position > k) {
        k++;
        ptr2 = ptr1;
        ptr1 = ptr1.next;
      }
      ptr2.next = ptr1.next;
      return head;
    }
  }
}
