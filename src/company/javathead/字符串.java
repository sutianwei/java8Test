package company.javathead;

import java.util.Scanner;

public class 字符串 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("请输入一串字符串：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Select select = new Select();
        // select.sort(s);
        System.out.println("排序后的字符串为：");
        System.out.println(select.sort(s));
    }

}

class Select {
    public static String sort(String str) {
        //利用toCharArray可将字符串转换为char型的数组
        char[] s1 = str.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < i; j++) {
                if (s1[i] < s1[j]) {
                    char temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
            }
        }
        //再次将字符数组转换为字符串，也可以直接利用String.valueOf(s1)转换
        String st = new String(s1);
        return st;
    }

}
