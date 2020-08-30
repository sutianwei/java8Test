package company.排序;

public class 桶排序 {
    public static void main(String args[]) {
        int[] showsize = {34, 35, 36, 37, 38, 33};
        //分配桶的大小
        int[] arrs = new int[11];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = 0;
        }
        //把数组放到桶里
        for (int i = 0; i < showsize.length; i++) {
            int size = showsize[i] - 30;
            arrs[size] = arrs[size] + 1;
        }
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i]; j++) {
                int size = i + 30;
                System.out.println(size);
            }
        }
    }

    public static void bucketSort(int[] arr) {


    }
}
