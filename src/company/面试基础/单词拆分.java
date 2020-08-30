package company.面试基础;

import java.util.Set;

public class 单词拆分 {
    public boolean wordBreak(String s, Set<String> dict) {

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            if(!dp[i]){
                continue;
            }
            for (String str : dict) {
                if (i + str.length() <= s.length() && s.substring(i, i + str.length()).equals(str))
                    dp[i + str.length()] = true;
            }
        }
        return dp[s.length()];
    }
}
