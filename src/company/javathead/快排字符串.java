package company.javathead;

public class 快排字符串 {
    static final int N = 5;

    static void quicksort(String[] arr, int left, int right) {
        String f, t;
        int rtemp, ltemp;
        ltemp = left;
        rtemp = right;
        f = arr[(left + right) / 2];
        while (ltemp < rtemp) {
            while (arr[ltemp].compareTo(f) < 0) {
                ++ltemp;
            }
            while (arr[ltemp].compareTo(f) > 0) {
                --rtemp;
            }
            if (ltemp <= rtemp) {
                t = arr[ltemp];
                arr[ltemp] = arr[rtemp];
                arr[rtemp] = t;
                --rtemp;
                ++ltemp;
            }
        }
        if (ltemp == rtemp) {
            ltemp++;
        }
        if (left < rtemp) {
            quicksort(arr, left, ltemp - 1);
        }
        if (ltemp < right) {
            quicksort(arr, rtemp + 1, right);
        }
    }

    public static void main(String args[]) {
        String[] arr = new String[]{"df", "sf", "wer", "wrwr", "tyh"};
        int i;
        System.out.println("排序前\n");
        for (i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
        quicksort(arr, 0, N - 1);
        System.out.println("排序后面");
        for (i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
