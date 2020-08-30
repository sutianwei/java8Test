package company.company;

import java.util.Scanner;

/**
 * 输入描述: 输入包括一个整数n,(1 ≤ n ≤ 10^5)
 * 输出描述: 输出一个整数,表示n的相反数
 * 输入例子1: 1325
 * 输出例子1: 6556
 */

public class Reverse {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString()) + Integer.parseInt(s));
        sc.close();
    }
}
