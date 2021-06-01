package myown;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}


public class 合并兩個排序鏈表 {

    public static void main(String[] args) {
        Node l1 = new Node(1); Node l2 = new Node(3);
        Node secNode1= new Node(6);Node secNode2= new Node(5);
        Node thiNode1= new Node(9);Node thiNode2= new Node(11);
        //把节点连起来
        l1.next=secNode1;secNode1.next=thiNode1;
        l2.next=secNode2;secNode2.next=thiNode2;
        System.out.println(merge2(l1,l2));
    }




    public static Node merge2(Node l1, Node l2) {
        Node dump = new Node(0);
        Node cur = dump;

        while (l1 != null && l2 != null) {
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
        }

        if (l2 != null) {
            cur.next = l2;
        }


        return cur.next;

    }


    /** 输⼊两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满⾜单调不减规则 */
    public Node Merge(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }


    }




}
