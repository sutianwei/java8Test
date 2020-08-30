package company.offer;

import java.util.ArrayList;
import java.util.Stack;

class ListNodeUtil {
    /**
     * 尾插法创建链表
     *
     * @param input
     * @return
     */
    public static ListNode buildListNode(int[] input) {
        if (input.length == 0) return null;
        ListNode head = new ListNode(input[0]);
        ListNode currentNode = head;
        for (int i = 1; i < input.length; i++) {
            currentNode.next = new ListNode(input[i]);
            currentNode = currentNode.next;
        }
        return head;
    }
}

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}


public class offer3 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    /**
     * 利用动态数组的性质将链表元素从头到尾依次添加到动态数组索引为0的位置，这样最后添加进
     * 来的元素放在首位，第一个添加进来的元素则放在末尾，也就实现了倒序
     *
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) return list;
        list.add(0, listNode.val);
        ListNode temp = listNode.next;
        while (temp != null) {
            list.add(0, temp.val);
            temp = temp.next;
        }
        return list;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        ListNodeUtil listNodeUtil = new ListNodeUtil();
        int[] arr = {1, 2, 3, 4, 5};
        ListNode listNode = listNodeUtil.buildListNode(arr);
        System.out.println(printListFromTailToHead2(listNode));
        long end = System.nanoTime();
        System.out.println("运行时间：" + (end - start) + "ns");
    }

    //stack  susu
    public static ArrayList<Integer> printListFromTailToHeadw(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> rs = new ArrayList<>();
        while (!stack.isEmpty()) {
            rs.add(stack.pop());
        }
        return rs;


    }


}
