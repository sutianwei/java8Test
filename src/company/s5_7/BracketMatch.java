package company.s5_7;

import java.util.Scanner;

import java.util.Stack;


public class BracketMatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
int jjj;

        Stack<Character> stack = new Stack<>();

        int result = 1;

        char c;


        for (int i = 0; i < s.length(); i++) {

            c = s.charAt(i);

            if (c == '(') {

                stack.push(c);


            }

            if (c == ')') {

                int size = stack.size();

                result *= size;

                stack.pop();

            }

        }


        System.out.println(result);

    }

}
