package RemoveMiddleNode;

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

