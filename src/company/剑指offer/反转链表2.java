package company.剑指offer;


public class 反转链表2 {
    private static class ListNode {
        private ListNode next;
        private Object value;

        public ListNode(Object value) {
            super();
            this.value = value;
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 6, 6, 7, 3, 3, 5, 3, 8, 9, 10, 10};
        ListNode head = new ListNode(arr[0]);
        ListNode p = head;
        for (int i = 1; i < arr.length; i++) {
            p.next = new ListNode(arr[i]);
            p = p.next;
        }
        p = head;
        while (p != null) {
            System.out.println(p.value + "");
            p = p.next;
        }
        System.out.println("\n");
        p = reverseLinkedList(head);
        while (p != null) {
            System.out.println(p.value + "");
            p = p.next;
        }


    }

    public static ListNode reverseLinkedList(ListNode node) {
        if (node.next == null) {
            return node;
        }
        ListNode p = reverseLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return p;
    }


}
