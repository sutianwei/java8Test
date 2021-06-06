package myown;

import java.math.BigDecimal;
import java.util.*;

import static myown.test.get;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}


public class 合并兩個排序鏈表 {

    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node l2 = new Node(3);
        Node secNode1 = new Node(6);
        Node secNode2 = new Node(5);
        Node thiNode1 = new Node(9);
        Node thiNode2 = new Node(11);
        //把节点连起来
        l1.next = secNode1;
        secNode1.next = thiNode1;
        l2.next = secNode2;
        secNode2.next = thiNode2;
        System.out.println(merge2(l1, l2));


        List<Integer> list = new ArrayList<>();
        String str = "010207151618202124252935405254626566707807101314233237394346515354586061727374800306082330354041444647505254586667687178" +
                "252632374244454950515762656768697073757702040506080913192223293540414850525457770108111629313538394152575961626369717374";//字符串
        int m = str.length() / 2;
        if (m * 2 < str.length()) {
            m++;
        }
        String[] strs = new String[m];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {//每隔两个
                strs[j] = "" + str.charAt(i);
            } else {
                strs[j] = strs[j] + str.charAt(i);//将字符加上两个空格
                j++;
            }
        }
        for (int i = 0; i < strs.length; i++) {
            list.add(Integer.valueOf(strs[i]));
        }


        HashMap map = get(list);
        for (Object key : map.keySet()){
            System.out.println(key+"--"+map.get(key));
        }


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
