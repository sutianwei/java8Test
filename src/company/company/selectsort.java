package company.company;

/**
 * 选择排序
 * 找出最小的  一遍一遍找
 * w'w
 * 第一个和所后面有的比较，最小的去第一位，第二个和后面所有比较，最小的去第二
 */
public class selectsort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 45, 33, 234};
        System.out.println("交换之前的");
        for (int num : arr) {
            System.out.println(num + "");
        }
        for (int i = 0; i < arr.length; i++) {
            //int k=i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    //swap(i,j)
                }
            }

        }
        System.out.println();
        System.out.println("交换后：");
        for (int num : arr) {
            System.out.println(num + "   ");
        }
    }
}
