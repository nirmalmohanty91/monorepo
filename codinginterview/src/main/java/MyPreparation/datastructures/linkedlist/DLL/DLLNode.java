package MyPreparation.datastructures.linkedlist.DLL;

public class DLLNode {
  public DLLNode prev;
  public int data;
  public DLLNode next;

  public DLLNode(int data, DLLNode prev) {
    this.data = data;
    this.next = null;
    this.prev = prev;
  }
}
