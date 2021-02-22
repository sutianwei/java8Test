package 剑指offerAll;

public class 两个链表的第一个公共节点 {

    /**
     * A 向后遍历，遍历完，走B的路
     * B 向后遍历，遍历完，走A的路
     * 当A 走了ALL+B
     * B走了ALL+A
     * 相遇
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode A = headA;
        ListNode B = headB;

        while (A != B) {
            if (A == null) {
                A = headB;
            } else {
                A = A.next;
            }

            if (B == null) {
                B = headA;
            } else {
                B = B.next;
            }
        }
        return A;

    }
}
