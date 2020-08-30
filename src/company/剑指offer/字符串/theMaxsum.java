package company.剑指offer.字符串;

import java.util.Scanner;

/*
 *
 * 动态规划思想。状态方程 ： max( dp[ i ] )  = getMax(  max( dp[ i -1 ] ) + arr[ i ] ,arr[ i ] )
 * 。上面式子的意义是：我们从头开始遍历数组，遍历到数组元素 arr[ i ] 时
 * ，连续的最大的和 可能为 max( dp[ i -1 ] ) + arr[ i ] ，也可能为 arr[ i ] ，
 * 做比较即可得出哪个更大，取最大值。时间复杂度为 n
 * 求所有子数组里面的最大和。例如现在有数组 {1 ， -2 ， 3 ， 10 ， -4 ， 7 ， 2 ， -5 }。

 *
 * */
public class theMaxsum {


    public static void main(String[] args) {
        theMaxsum th = new theMaxsum();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = scanner.nextInt();
            System.out.println(th.find1(a));
            System.out.println(th.find2(a, a.length));
        }
    }

    public int find1(int[] array) {
        if (array == null || (array.length == 1 && array[0] <= 0))
            return 0;
        int cur = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (cur < 0)
                cur = 0;
            cur = cur + array[i];
            if (sum <= cur)
                sum = cur;
        }
        return sum;

    }

    public int find2(int[] arr, int n) {
        int sum = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            if (sum >= max)
                max = sum;
        }
        return max;
    }


}
