package 剑指offerAll;

import java.util.ArrayList;
import java.util.*;

public class 最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int b[] = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = arr[i];
        }
        return b;


    }
}
