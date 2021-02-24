package 剑指offerAll;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class 左旋转字符串 implements Serializable {

    /**
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
     * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     */
    public static String reverseLeftWords(String s, int n) {
        System.out.println(System.currentTimeMillis());
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    public static String reverseLeftWords1(String s, int n) {
        System.out.println("sss"+System.currentTimeMillis());
        String res = "";
        for (int i = n; i < s.length(); i++) {
            res += s.charAt(i);
        }

        for (int i = 0; i < n; i++) {
            res += s.charAt(i);
        }

        return res;

    }

    public static void main(String[] args) {
        reverseLeftWords1("abcdefg",2);
        System.out.println("sss"+System.currentTimeMillis());

    }
}
