package company.排序;

/*
* 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
针对所有的元素重复以上的步骤，除了最后一个。
*时间复杂度：n^2
* */
public class 冒泡 {
    public static void main(String args[]) {

        int[] a = {1, 123, 43255, 45, 65, 56, 456, 58665};
        bubbleSort(a);
        for (int s : a) {
            System.out.println(s);
        }


    }

    public static void bubbleSort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        for (int i = 0; i < a.length - 1; i++) {
            //内层循环控制到达位置
            for (int j = 0; j < a.length  - 1; j++) {
                //前面的元素比后面大就交换
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
