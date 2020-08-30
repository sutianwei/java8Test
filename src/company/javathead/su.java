package company.javathead;

import java.util.Scanner;
import java.util.Stack;

public class su {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String I = in.next();
        String O = in.next();
        for (int i = 0; i < T; i++) {

            if (check(I, O) == true)
                System.out.println("对的");
            else
                System.out.println("错的");
        }
    }

    public static boolean check(String I, String O) {
        Stack<Character> stack = new Stack<>();
        int j = 0;
        for (char ch : I.toCharArray()) {
            stack.push(ch);
            while (!stack.isEmpty() && O.charAt(j) == stack.peek()) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

}

