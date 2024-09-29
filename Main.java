public class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedListOperations {

    public ListNode removeMiddleNode(ListNode head) {
        // If the list has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast = head, slow = head, prev = null;

        // Using slow and fast pointers to find the middle
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is now pointing to the middle node, remove it
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Creating nodes and forming the linked list
        ListNode node7 = new ListNode(6);
        ListNode node6 = new ListNode(2, node7);
        ListNode node5 = new ListNode(1, node6);
        ListNode node4 = new ListNode(7, node5);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode head = new ListNode(1, node2);

        // Performing operations using LinkedListOperations class
        LinkedListOperations operations = new LinkedListOperations();
        
        System.out.println("Original List:");
        operations.printList(head);

        head = operations.removeMiddleNode(head);

        System.out.println("List after removing middle node:");
        operations.printList(head);
    }
}
