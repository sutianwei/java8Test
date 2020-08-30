package company.offer;

import java.util.Scanner;

//在一个二维数组中（每个一维数组的长度相同），
// 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
// 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。


public class 二维数组查找 {
    public static void main(String args[]) {
        Scanner scanne = new Scanner(System.in);
        int ta = scanne.nextInt();
        int[][] ar = new int[][]{{1, 2, 3, 4, 5}, {12, 342, 45, 57, 76}};
        System.out.println(find(ta, ar));
    }


    public static boolean find(int target, int[][] array) {//有序查找
        int rows = array.length;//行数
        int lie = array[0].length;
        int i = 0;
        while (rows > 0 && i < lie) {
            if (target > array[rows - 1][i]) {
                i++;
            } else if (target < array[rows - 1][i]) {
                rows--;
            } else {
                return true;
            }
        }
        return false;


    }
}
