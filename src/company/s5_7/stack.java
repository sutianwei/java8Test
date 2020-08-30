package company.s5_7;

import java.util.Stack;

public class stack {
    public static void main(String args[]) {
        Stack<String> st = new Stack<>();
        for (String s : "my  dogf  has ".split("  "))
            st.push(s);
        while (!st.empty()) {
            System.out.println(st.pop() + "  ");
        }
    }
}
