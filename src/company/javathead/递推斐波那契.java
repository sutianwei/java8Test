package company.javathead;

import java.util.Scanner;

/**
 * @Author: sutianwei
 * @Date: 2019/5/26 1:02
 * 我们先来分析一下兔子产仔问题，逐月来看每月的兔子数量：
 * <p>
 * 第一个月： 1对
 * 第二个月： 1对
 * 第三个月： 2对
 * 第四个月： 3对
 * 第五个月： 5对
 * <p>
 * …
 * <p>
 * 从上面可以看出，从第三个月开始，每个月的兔子总对数，等于前两个月兔子对数的总和。
 * <p>
 * 显然的斐波那契数列，也是递推法的典型问题。
 * <p>
 * 第n个月兔子总量： Fn=Fn−2+Fn−1Fn=Fn−2+Fn−1
 * 这里，初始第一个兔子F1=1F1=1， 第二个月兔子F2=1
 */
public class 递推斐波那契 {
    public static int fibonacci(int n) {
        int t1, t2;
        if (n == 1 || n == 2) {//因为12月都是1个
            return 1;
        } else {
            t1 = fibonacci(n - 1);
            t2 = fibonacci(n - 2);
            return t1 + t2;
        }
    }

    public static void main(String[] args) {
        System.out.println("递推解决斐波那契数列");
        System.out.println("输入时间");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = fibonacci(n);
        System.out.println("还有" + n + "时间产生" + num + "兔子");
    }


}
