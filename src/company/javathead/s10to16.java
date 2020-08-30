package company.javathead;

import java.util.Scanner;

public class s10to16 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("请输入要转换的十进制的数：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("转换的十六进制的数为：" + intohex(n));
    }

    public static String intohex(int n) {
        StringBuilder s = new StringBuilder(8);
        String a;
        char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (n != 0) {
            s = s.append(b[n % 16]);
            n = n / 16;
        }
        a = s.reverse().toString();
        return a;
    }
}
