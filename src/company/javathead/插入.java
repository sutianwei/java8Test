package company.javathead;

import java.util.Arrays;

/**
 * @Author: sutianwei
 * @Date: 2019/5/26 23:57
 */
public class    插入 {
    public static void main(String[] args) {
//        int[] ins = new int[]{2, 34, 3, 5, 54, 656,323,343, 454,};
//        int[] ins2 = sort(ins);
//        for (int in : ins2) {
//            System.out.println(in);
//        }
        int[] arra12y = new int[]{324, 3243, 34, 23, 54, 56, 8, 6, 8};
        int[] ins = insertSort(arra12y);
//        for (int s : ins) {
//            System.out.println(s);
//        }
        System.out.println(Arrays.toString(ins));
    }

    public static int[] insertSort(int[] array) {
        //直接插入排序			/
        // /在排序之前我们需要搞清一个思路，新插入一个数据的时候，排序过后的数组都是
        // 从小到大排列好的，所以我们需要从后往前查找，直到找到比我们要插入的数字还小的
        // 值。这个时候我们需要一个变量j作为标识
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {                    //将大于temp的数向后移动一步
                if (array[j] > temp) {
                    array[j + 1] = array[j];//记录j的值也就是temp要插入的位置
                } else {
                    break;
                }
            }
            array[j + 1] = temp;
        }
        return array;
    }


//    public static int[] sort(int[] ins) {
//        for (int i = 1; i < ins.length; i++) {
//            for (int j = i; j > 0; j++) {
//                if (ins[j] < ins[j - 1]) {
//                    int temp = ins[j - 1];
//                    ins[j - 1] = ins[j];
//                    ins[j] = temp;
//                }
//            }
//        }
//        return ins;
}


