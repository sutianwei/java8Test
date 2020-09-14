package 剑指offer.easyLevel;


import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class 两个栈实现队列 {

    /*
     *  两个栈stack 1  stack2
     *   push 在stack1 进行
     *   pop在stack2 进行，当2不为空时直接pop。当2 为空，先把1 的数据pop出来，push到2 中，在从2 pop
     *
     */
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public  int pop1() {
        int node;
        if (stack1.isEmpty() && stack2.isEmpty())
            throw new RuntimeException("is null");

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                node = stack1.pop();
                stack2.push(node);
            }
        }
        return stack2.pop();
    }

}
