package company.剑指offer.字符串;

/*
 * KMP字符串匹配
 *请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * daasd ad a d
 * */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        StringBuffer ss = new StringBuffer();
        ss.append("we are  h appy");
        System.out.println(solution.repalceSpace(ss));
    }

    public String repalceSpace(StringBuffer str) {
        int length = str.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char b = str.charAt(i);
            if (String.valueOf(b).equals(" ")) {
                result.append("%20");

            } else {
                result.append(b);
            }
        }
        return result.toString();
    }
}
