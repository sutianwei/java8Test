package company.javathead;

import java.util.Arrays;

/**
 * 数组为N大小，1和(n/2)+1比较，1>(n/2)+1时换位置，2和(n/2)+2比较，换位置以此类推
 * 第二次1和(n/4)+1相比。。。。
 * 第三次1和(n/8)+1比较
 * 直到结果ok
 */


public class Shell {
    public static void main(String args[]) {
        Integer[] arr = new Integer[]{12, 34, 324, 344535, 454, 234, 12, 656};
        int j;
        for (int inteval = arr.length / 2; inteval > 0; inteval /= 2) {
            for (int i = inteval; i < arr.length; i++) {
                Integer temp = arr[i];
                for (j = i; j >= inteval && temp.compareTo(arr[j - inteval]) < 0; ) {
                    arr[j] = arr[j - inteval];
                }
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
