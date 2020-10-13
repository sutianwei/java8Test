package 剑指offer.easyLevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 有效的括号 {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * <p>
     * 有效字符串需满足：
     * <p>
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     */

    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character,Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++){
            char ch=s.charAt(i);
            if (pairs.containsKey(ch)){
                if (stack.isEmpty() || stack.peek()!= pairs.get(ch)){
                        return  false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }

            return stack.isEmpty();
    }
}
