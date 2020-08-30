package company.面试基础;

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode mergeHead = null;
        ListNode current = null;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (mergeHead == null) {
                    mergeHead = current = list1;
               /*
               刚开始第一步就是将第一个最小的数赋予mergeHead，这是很重要的一步，这样mergeHead
               就可以代表合并后的整个链表，这里有个概念需要说明一下，无论是list1,list2,current,mergehead，他们都是一个对象，
               那么例如mergeHead = current，他们操作的都是同一个对象
               */
                } else {
                    current.next = list1;//将current指向的下个地址设为list1
                    current = current.next;// current 往后移动一位
                }
                list1 = list1.next; //list1往后移动一位
            } else {
                if (mergeHead == null) {
                    mergeHead = current = list2;
                } else {
                    current.next = list2;
                    current = current.next;
                }
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            current.next = list2;
        } else {
            current.next = list1;
        }
        return mergeHead;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode r1 = new ListNode(4);
        ListNode r2 = new ListNode(5);
        ListNode r3 = new ListNode(6);
        ListNode r4 = new ListNode(7);
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;

        ListNode merged = new ListNode(-1);
        merged = Merge(l1, r1);
        while (merged != null) {
            System.out.println(merged.val);
            merged = merged.next;

        }

    }
}