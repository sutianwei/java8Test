package 剑指offer.easyLevel;


/**
 * 实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
 *
 */
public class 删除中间节点 {
    public void delete(Node node){
        node.data=node.next.data;
        node.next=node.next.next;
    }
}
