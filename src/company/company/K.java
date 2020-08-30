package company.company;

import java.util.Arrays;

/**
 * @Author: sutianwei
 * @Date: 2019/5/21 18:10
 */
public class K {
    public static int fun(int a[], int k) {
        Arrays.sort(a);
        return a[k - 1];
    }

    public static void main(String args) {

    }

}
