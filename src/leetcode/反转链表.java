package leetcode;

import company.company.ListNode;

import java.util.List;

public class 反转链表 {

    public ListNode reverseList(ListNode head) {
        //头结点
        ListNode pre = null;

        ListNode cur = head;

        while (cur != head) {

            ListNode second = cur.next;
            cur.next = pre;
            pre = cur;
            cur = second;
        }
        return pre;


    }


    public ListNode revert(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = revert(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }
}
