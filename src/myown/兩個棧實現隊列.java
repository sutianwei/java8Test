package myown;

import java.util.Stack;

public class 兩個棧實現隊列 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // push 操作，push到stack1
    public void push(int node) {
        stack1.push(node);
    }

    // pop
    public int pop() {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("null");
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                int temp = stack1.pop();
                stack2.push(temp);
            }

        }
        return stack2.pop();


    }

}
