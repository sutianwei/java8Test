package company.offer;

import java.util.Scanner;

public class 空格替换字母 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

  System.out.println(replaceSpace(s));
    }

    public static    String replaceSpace(String str) {
        if (str == null)
            return null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
