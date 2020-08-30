package company.排序;
/*首先在未排序序列中找到最小（大）元素，
存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，
然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
* 
*
*
* */

public class 选择 {
    public static void main(String args[]) {
        int[] aa = {1, 23, 34, 465, 56, 78, 784};
        seletSort(aa);
        for (int s : aa) {
            System.out.println(s);
        }
    }

    public static void seletSort(int[] a) {
        int length = a.length;
        int temp = 0;
        for (int j = 0; j < length - 1; j++) {
            for (int i = j+1; i < length - 1; i++) {
                if (a[j] > a[i + 1]) {
                    // change
                    temp = a[j];
                    a[j] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
