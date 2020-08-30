package company.search;

import java.util.Arrays;

public class 二分查找 {

    public static int binSearch(int srcArray[], int start, int end, int key) {
        int mid = (end - start) / 2 + start;
        if (srcArray[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, start, mid - 1, key);
        }
        return -1;
    }


    public static void main(String args[]) {
        int[] srcArray = new int[]{2, 34, 5, 79, 97, 43, 234, 32};
        Arrays.sort(srcArray);
        System.out.println(binSearch(srcArray, 0, srcArray.length - 1, 32));
    }

}
