package leetcode;

import java.util.Scanner;

public class 二进制中1的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int n = sc.nextInt();
            String result = Integer.toBinaryString(n);
            char[] cha = result.toCharArray();
            int sum = 0;
            for (char c : cha) {
                if (c == '1') {
                    sum++;
                }
            }
            System.out.println(sum);

        }


    }
}
