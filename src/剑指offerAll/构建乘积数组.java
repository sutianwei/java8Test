package 剑指offerAll;

import java.util.ArrayList;

public class 构建乘积数组 {

    /**
     * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
     * 其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
     * <p>
     * 。
     */
    public static int[] constructArr(int[] a) {

        if (a.length == 0) {
            return new int[0];
        }
        int sum = 1;
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    sum = sum * a[j];
                    result[i] = sum;
                }
                if (j == a.length - 1) {
                    sum = 1;
                }

            }
        }
        return result;

    }


    public static int[] constructArr1(int[] a) {
        int[] res = new int[a.length];
        for (int i = 0, cur = 1; i < a.length; i++) {
            res[i] = cur;   // 先乘左边的数(不包括自己)
            cur *= a[i];
        }
        for (int i = a.length - 1, cur = 1; i >= 0; i--) {
            res[i] *= cur;  // 再乘右边的数(不包括自己)
            cur *= a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};

        for (int i : constructArr1(a)) {
            System.out.println(i);
        }

        System.out.println();
    }

}
