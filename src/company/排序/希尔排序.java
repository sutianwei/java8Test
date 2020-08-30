package company.排序;

public class 希尔排序 {
    public static void main(String args[]) {

        int[] a = {1, 34, 45, 3, 454, 657675, 456};
        sort(a);
        for (int s : a) {
            System.out.println(s);
        }
    }

    public static void sort(int[] arr) {        //初始化间隔
        int h = 1;
        while (h < arr.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {        //进行插入排序
            int temp = 0;
            for (int i = h; i < arr.length; i++) {
                temp = arr[i];
                int j = i;
                while (j > h - 1 && arr[j - h] >= temp) {
                    arr[j] = arr[j - h];
                    j = j - h;
                }
                arr[j] = temp;
            }
            h = (h - 1) / 3;
        }
    }


}
