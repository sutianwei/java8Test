package leetcode;

import company.company.ListNode;

public class 合并两个有序链表 {
    /**
     * 非递归方式
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dump = new ListNode(0);
        ListNode cur = dump;


        while (l1 != null && l2 != null) {

            //cur指向小的那一个
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;

        }
        if (l1 != null) {
            cur.next = l1;
        } else {
            cur.next = l2;
        }
        return dump.next;

    }


    public ListNode revert(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = null;


        if (l1.val<l2.val){
            head=new ListNode(l1.val);
            head.next=revert(l1.next,l2);
        }else {
            head=new ListNode(l2.val);
            head.next=revert(l1,l2.next);
        }
        return head;

    }
}
