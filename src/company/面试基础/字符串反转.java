package company.面试基础;

import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String  s=sc.nextLine();
        StringBuffer  s1=new StringBuffer(s);
        s1.reverse();
        System.out.println(s1);
    }
  
}
