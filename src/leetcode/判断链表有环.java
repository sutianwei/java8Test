package leetcode;


import company.company.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 判断链表有环 {

    public ListNode cycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode fast = head;
        while (fast != null){
            if (set.contains(fast)){
                return fast;
            }else {
                set.add(fast);
                fast=fast.next;
            }

        }
        return null;

    }
}
