package RemoveMiddleNode;

public class Main {
    public static void main(String[] args) {
        
        ListNode node7 = new ListNode(6);
        ListNode node6 = new ListNode(2, node7);
        ListNode node5 = new ListNode(1, node6);
        ListNode node4 = new ListNode(7, node5);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode head = new ListNode(1, node2);

        LinkedListOperations operations = new LinkedListOperations();
        
        System.out.println("Original List:");
        operations.printList(head);

        head = operations.removeMiddleNode(head);

        System.out.println("List after removing middle node:");
        operations.printList(head);
    }
}
