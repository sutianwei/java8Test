package company.javathead;

/**
 * @Author: sutianwei
 * @Date: 2019/5/26 23:33
 */
public class 选择 {

    public static void main(String[] args) {
        int arr[] = {34, 45, 23423, 465, 53, 56, 7879, 676, 3};
//int arr[]={23,12,46,24,76};
        int k = 0;
//冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    k++;
                }
                System.out.print("i=" + i + "的第j=" + j + "次交换\t");
                for (int d = 0; d < arr.length; d++) {
                    System.out.print(arr[d] + "\t");
                }
                System.out.println();
            }
        }

        System.out.println("交换的次数为" + k);
//选择排序
        int l = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                    l++;
                }
                System.out.print("i=" + i + "的第j=" + j + "次交换\t");
                for (int d = 0; d < arr.length; d++) {
                    System.out.print(arr[d] + "\t");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("交换的次数为" + l);
    }
}

