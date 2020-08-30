package company.company;

import java.util.Arrays;

/**
 * 插入排序
 * 找位置，比我大的都往后移位1个，找到比我小的我就刚好上
 * 从后往前排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 5, 8, 9, 0, 4, 5, 1, 6, 7, 8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {//外层循环书
            for (int j = i; j > 0; j--) {//内层排序数
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
