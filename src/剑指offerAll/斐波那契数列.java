package 剑指offerAll;

public class 斐波那契数列 {
    public int fib(int n) {
        // 特判
        if (n == 0) {
            return 0;
        }
        // 初始化
        int pre = 0;
        int cur = 1;
        int res;
        // 迭代n-1次
        for (int i = 0; i < n - 1; i++) {
            res = (pre + cur) % 1000000007;
            pre = cur;
            cur = res;
        }
        return cur;

    }

    public int fin2(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int sum=0;
        int [] dp =new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
            dp[i] %= 1000000007;
        }
        return  dp[n];
    }
}
