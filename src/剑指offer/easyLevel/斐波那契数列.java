package 剑指offer.easyLevel;

public class 斐波那契数列 {
    /**
     * F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
     *
     * @param n
     * @return
     */
    public static int finbonaci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else
            return finbonaci(n - 1) + finbonaci(n - 2);
    }


    public static int fin(int n) {
        int ans = 0;
        int temp1 = 0;
        int temp2 = 1;
        for (int i = 2; i <= n; i++) {
            ans = temp1 + temp2;
            temp1 = temp2;
            temp2 = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(finbonaci(10));
        System.out.println(fin(10));
    }


}
