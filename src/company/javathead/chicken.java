package company.javathead;

import java.util.Scanner;

/**
 * @Author: sutianwei
 * @Date: 2019/5/26 0:45
 * 鸡兔同笼/穷举法实现
 */
public class chicken {
    static int chicken, habbit;

    public static int qiongju(int head, int foot) {
        int j;
        int re = 0;
        for (int i = 0; i <= head; i++) {
            j = head - i;
            if (i * 2 + j * 4 == foot) {
                re = 1;
                chicken = i;
                habbit = j;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        int re, head, foot;
        System.out.println("鸡兔同笼");
        System.out.println("输入头数:");
        Scanner input = new Scanner(System.in);
        head = input.nextInt();
        System.out.println("输入脚数");
        foot = input.nextInt();
        re = qiongju(head, foot);
        if (re == 1) {
            System.out.println("鸡有" + chicken + "只" + "兔子" + habbit);
        } else {
            System.out.println("无法求解");
        }
    }
}
