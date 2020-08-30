package company.javathead;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: sutianwei
 * @Date: 2019/5/26 1:28
 */
public class 冒泡 {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 454, 3, 54,};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}