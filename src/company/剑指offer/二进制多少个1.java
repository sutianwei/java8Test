package company.剑指offer;

import java.util.Scanner;

public class 二进制多少个1 {
    public static void main(String[] args) {
        System.out.println("统计正整数n的二进制写法中有多少个1"); //题干
        Scanner in = new Scanner(System.in); //声明一个Scanner对象，接收键盘输入内容
        System.out.println("请输入一个整数："); //提示输入数据
        while (in.hasNextLong()) {
            long num = in.nextLong();
            if (num >= 0) {
                System.out.println(num + "二进制写法中有 " + count1num(num) + "个1");  //输出计算结果
                System.out.println("请再输入一个整数："); //提示输入数据
            } else {
                System.out.println("输入的不是正整数，请重新输入正整数："); //提示输入了负数
            }
        }
        in.close(); //关闭Scanner
        System.out.println("输入格式不对，程序结束!"); //程序结束提示
    }

    /**
     * 统计正整数n的二进制写法中有多少个1
     *
     * @param n
     * @return count
     * 使用算法：如n=9 (二进制写法1001) ，则n-1=8 (二进制写法1000)，
     * 1001 & 1000 后结果为1000，即去掉了最右端的1,
     * 1000 再& 0111 结果为0000，如此统计循环的次数即可
     */
    static int count1num(long n) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (count = 0; n > 0;) {  //每次将最后右端的1转换成0，循环统计1的个数
                n &= (n - 1);  //位运算
//                return count;
                count++;
                sum += count;
            }

        }

        return sum;
    }

}
