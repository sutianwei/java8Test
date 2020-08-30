package company.javathead;

import java.util.Scanner;

/**
 * @Author: sutianwei
 * @Date: 2019/5/26 1:16
 * 阶乘
 */
public class 递归 {
    static long fact(int n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int i;
        System.out.println("输入阶乘的数字");
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        System.out.println("jieguo" + fact(i));
    }

}
