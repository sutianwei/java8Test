package tohw;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


class ListNode {

    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListTets {

    /**
     * 环形链表
     */
    public boolean hasCircle(ListNode head) {
        Set<ListNode> set = new LinkedHashSet<>();
        while (head != null) {

            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }

        return false;

    }

    public boolean hasCircle2(ListNode head) {

        if (head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != null && fast != null){
            if (slow.equals(fast)){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;


    }


    /**
     * 反转链表
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode cur = head;


        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;

        }
        return pre;


    }

    /**
     * 亮亮交换链表
     */

    public static ListNode swap(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = new ListNode(0);
        pre.next = head;
        while (head != null && head.next != null) {
            ListNode fir = head;
            ListNode sec = head.next;

            pre.next = sec;
            fir.next = sec.next;
            sec.next = fir;
            pre = fir;
            head = fir.next;


        }
        return pre.next;

    }


    public static void main(String[] args) {
        ListNode listNode = add();

        System.out.println(swap(listNode));


    }

    public static ListNode add() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }

}
