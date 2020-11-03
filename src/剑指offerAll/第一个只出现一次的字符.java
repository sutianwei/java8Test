package 剑指offerAll;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class 第一个只出现一次的字符 {

    /**
     * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
     *
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc) {
            //遍历，存放在hashmap中
            dic.put(c, !dic.containsKey(c));
        }
        for (char c : sc) {
            if (dic.get(c)) {
                return c;
            }
        }
        return ' ';

    }


    public char firstUniqChar2(String s) {
        HashMap<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc) {
            dic.put(c, !dic.containsValue(c));
        }
        for (Map.Entry<Character, Boolean> d : dic.entrySet()) {
            if (d.getValue()) {
                return d.getKey();
            }
        }
        return ' ';
    }
}
