package company.剑指offer.字符串;

import java.util.Arrays;
import java.util.Scanner;

public class 括号匹配深度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0, max = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(')
                cnt++;
            else
                cnt--;
            max = Math.max(max, cnt);
        }
        sc.close();
        System.out.println(max);
    }


}
