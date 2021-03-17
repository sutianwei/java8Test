package leetcode;

import company.company.ListNode;

import java.util.LinkedList;

public class 合并有序链表 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode pre = null;
        if (l1.val < l2.val) {
            pre = l1;
            l1.next = mergeTwoLists(l1.next, l2);
        } else {
            pre = l2;
            l2.next = mergeTwoLists(l1, l2.next);
        }
        return pre;

    }


    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode temp = new ListNode(0);
        ListNode cur = temp;
        while (l1 != null && l2 != null) {
            if (l1.val <l2.val){
                cur.next=l1;
                cur=cur.next;
                l1=l1.next;
            }else {
                cur.next=l2;
                cur=cur.next;
                l2=l2.next;
            }

        }

        if (l1!=null){
            cur.next=l1;
        }
        if (l2!=null){
            cur.next=l2;
        }

        return temp.next;


    }
}
