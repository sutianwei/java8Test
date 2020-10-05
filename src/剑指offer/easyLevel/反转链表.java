package 剑指offer.easyLevel;

public class 反转链表 {


    public Node reverseList(Node head) {
        Node pre = null;
        Node cur = head;
        while (cur != null) {
            Node second = cur.next;
            cur.next = pre;
            pre = cur;
            cur = second;
        }
        return pre;
    }
}
