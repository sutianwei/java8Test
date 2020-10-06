package 剑指offer.easyLevel;

import java.util.HashSet;
import java.util.Set;

public class 环路检测 {

   /*给定一个链表，如果它是有环链表，实现一个算法返回环路的开头节点。有环链表的定义：在链表中某个节点的next元素指向在它前面出现过的节点，则表明该链表存在环路。*/
    public Node detectCycle(Node head){
        Set<Node>  set = new HashSet<>();
        Node fast = head;
        while (fast!=null){
            if (set.contains(fast)){
                return  fast;
            }else {
                set.add(fast);
                fast=fast.next;
            }
        }
        return  null;
    }
}
