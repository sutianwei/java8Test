package company.s5_7;

/**
 * @Author: sutianwei
 * @Date: 2019/5/7 0:48
 */
public class s {
    static int cnt = 0;
    public static void main(String[] args) {
        fib(7);
        System.out.println(cnt);
    }
    static int fib(int n) {
        cnt++;
        if (n == 0)
            return 1;
        else if (n == 1)
            return 2;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
