package company.面试基础;

public class 链表中间节点 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
       // ListNode head = ListNode.arrayToList(arr);

    }

    private static void findMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            if (fast.next.next != null && fast.next != null && fast != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        System.out.println(slow.val);
    }
}
