package company.排序;

/*
 *
 *归并排序是一种稳定的排序算法，归并排序的主要问题在于它需要一个与待排序数组一样大的辅助数组空间。
 * 由于归并排序每次划分时两个子序列的长度基本一样，所以归并排序最好、最差和平均时间复杂度都是nlog2n。
 *
    把长度为n的输入序列分成两个长度为n/2的子序列；
    对这两个子序列分别采用归并排序；
    将两个排序好的子序列合并成一个最终的排序序列。

 *
 * */
public class MergeSort {
    public void mergeSort(int a[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(a, left, right);//
            mergeSort(a, left + 1, right);
            merge(a, left, middle, right);
        }

    }

    private void merge(int[] a, int left, int right, int middle) {
        int[] tempArray = new int[a.length];
        int rightStart = middle + 1;
        int temp = left;
        int third = left;
        while (left <= middle && rightStart <= rightStart) {
            if (a[left] <= a[rightStart]) {
                tempArray[third++] = a[left++];
            } else {
                tempArray[third++] = a[rightStart++];
            }
        }
        while (left <= middle) {
            tempArray[third++] = a[left++];
        }
        //如果左边比较 完毕需要比较左边 则同理把右边元素插入到数组中
        while (rightStart <= right) {
            tempArray[third++] = a[rightStart++];
        }
        //新数组排序完毕
        //将新的临时数组赋值给我们要排序的数组 a
        while (temp <= right) {
            a[temp] = tempArray[temp++];
        }

    }

    public static void main(String args[]) {
        int a[] = new int[]{4, 1, 5, 7, 9, 21, 86, 3, 32, 12};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(a, 0, a.length - 1);
        for (int num : a) {
            System.out.print("\t" + num);
        }
    }

}

