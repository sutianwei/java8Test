package company.javathead;

import java.util.Scanner;
import java.util.Stack;

public class s24 {
    public   static   void   main(String  arg[]){
//        to10(11);
        Scanner  in=new Scanner(System.in);
        int   num=in.nextInt();
        int T=in.nextInt();
        for (int i=0;i<T;i++){
//            System.out.println(to10(num));
            to10(num);
        }
    }

    public static void to10(int num) {
        int sum = 0;
        char[] chars = Integer.valueOf(num).toString().toCharArray();
        Stack stack = new Stack();
        for (char c : chars) {
            stack.push(c);
        }
        for (int i = 0 ; i < chars.length ; i ++) {
            sum += Integer.valueOf(((Character)stack.pop()).toString())*N(24,i);
        }


        System.out.println(sum);
    }

    public static int N(int a, int b) {
        if (b == 0) {
            return 1;
        }
        for (int i = 0; i < b; i++) {
            a = a*N(a,--b);
        }
        return a;
    }

}
