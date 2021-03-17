package 剑指offerAll;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class 用两个栈实现队列 {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public void CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            int delete = stack2.poll();
            return delete;
        }
    }






    Stack<Integer> stack11 = new Stack<Integer>();
    Stack<Integer> stack22 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack11.empty() && stack22.empty()){
            throw new RuntimeException("error");
        }
        if(stack22.empty()){
            while(!stack11.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
