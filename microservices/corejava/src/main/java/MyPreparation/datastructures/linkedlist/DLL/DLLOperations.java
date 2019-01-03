package MyPreparation.datastructures.linkedlist.DLL;

public class DLLOperations {
    public static void printDoublyLL(DLLNode head) {
        while (head!= null) {
            System.out.print(head.data + " ");
            head=head.next;
        }
        System.out.println();
    }
}
