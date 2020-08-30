package company.排序;
/*
    从第一个元素开始，该元素可以认为已经被排序；
    取出下一个元素，在已经排序的元素序列中从后向前扫描；
    如果该元素（已排序）大于新元素，将该元素移到下一位置；
    重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
    将新元素插入到该位置后；
    重复步骤2~5。

*
*
*
* */
public class 插入 {
    public static void main(String args[]) {
        int[] arr = {123, 324, 45, 3, 45, 34, 42424, 242, 4435435, 35};
        twoInsert(arr);
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

    public static void Insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
//           要插入的数字  也就是拿起来得数字
            int insertVal = arr[i];
            //被插入得位置
            int index = i - 1;
            while (index >= 0 && insertVal < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = insertVal;
        }
    }

    //二分插入
    public static void twoInsert(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int left = 0;
            int right = i - 1;
            int mid;
            while (left <= right) {
                mid = (left + right) / 2;
                if (temp < a[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                a[j + 1] = a[j];
            }
            if (left != i) {
                a[left] = temp;
            }
        }

    }
}

