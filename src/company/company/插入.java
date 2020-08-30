package company.company;

public class 插入 {
    public static void main(String args[]) {
        int[] arr = {123, 324, 45, 3, 45, 34, 42424, 242, 4435435, 35};
        insertSort(arr);
        for (int a : arr) {
            System.out.println(a);
        }

    }

    public static void insertSort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}

