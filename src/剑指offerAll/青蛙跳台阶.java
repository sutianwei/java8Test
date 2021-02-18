package 剑指offerAll;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 */
public class 青蛙跳台阶 {

    public static int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // 初始状态
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        // 状态转移
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1000_000_007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numWays(3));
    }

}
















