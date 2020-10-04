package 剑指offer.easyLevel;

import java.util.*;

public class 删除重复节点 {
    public static Node removeDuplicateNodes(Node head) {

        Set<Integer> set = new HashSet<>();
        Node fast = head;
        while (fast != null && fast.next != null) {
            set.add(fast.data);
            if (set.contains(fast.next.data)) {

                fast = fast.next.next;
            } else fast = fast.next;
        }
        return head;
    }


}
