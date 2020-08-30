package company.s5_7;
/**
 * 冒泡排序
 * 第一个和后面每一个比较，一次循环结束，第二个和后面每个比较
 * 时间复杂度：o(n^2)
 * 空间复杂度：o（1）
 * 从左往右比较
 */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 234234, 23432, 222, 34, 6, 11, 7};
        sort(array);
        System.out.println(Arrays.toString(array));
    }


    private static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {//排序的趟数
            for (int j = 0; j < n - 1; j++) {//每一趟的排序多少次
                if (array[j] < array[j + 1]) {//i和J换位置
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
