package company.s5_7;

import java.util.Scanner;

/**
 * @Author: sutianwei
 * @Date: 2019/5/15 19:23
 */
public class niu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum1=0;
        int sum2=0;
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("输入第二组：");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        if (a1 >= 1 && c1 <= 13 && b1 <= 13) {
            if (a2 >= 1 && c2 <= 13 && b2 <= 13) {
                sum1 = a1 + b1 + c1;
                 sum2 = a2 + b2 + c2;
            }
        }
        if (sum1 >sum2){
            System.out.println("牛牛胜利");
        }else {
            System.out.println("牛牛输了");
        }
    }
}
