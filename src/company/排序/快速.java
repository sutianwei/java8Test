package company.排序;

/*
*
*
    从数列中挑出一个元素，称为 “基准”（pivot）；
    重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
    递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。

*
*
*
*
* */
public class 快速 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] a = {12, 20, 5, 16, 15, 1, 30, 45, 23, 9};
        int start = 0;
        int end = a.length - 1;
        sort(a, start, end);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];


        while (end > start) {
            //从后往前比较
            while (end > start && a[end] >= key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while (end > start && a[start] <= key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if (start > low) sort(a, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        if (end < high) sort(a, end + 1, high);//右边序列。从关键值索引+1到最后一个
    }

}
