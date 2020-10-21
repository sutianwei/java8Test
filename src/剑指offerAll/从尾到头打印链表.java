package 剑指offerAll;

import company.company.ListNode;

import java.util.Stack;


class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
    }
}
public class 从尾到头打印链表 {
    public int[] reversePrint(ListNode1 head) {
        /**
         * 用栈存储数据，在导出到数组
         */
        Stack<ListNode1> stack = new Stack<>();
        ListNode1 fast = head;
        while (fast != null) {
            stack.push(fast);
            fast = fast.next;
        }
        int nums[] = new int[stack.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = stack.pop().val;
        }
        return nums;

    }
}
