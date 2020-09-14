package com.su.com;

public class Stack {
   public static void main(String[] args) {
       java.util.Stack<Integer> stack=new java.util.Stack<>();
       stack.push(2);
       stack.push(23);
       stack.push(222);
       stack.push(22122);
       System.out.println(stack);
       //从栈底开始算起  1 2  3 4  5
       System.out.println(stack.search(23));
       System.out.println(stack.contains(222));
  }
}
