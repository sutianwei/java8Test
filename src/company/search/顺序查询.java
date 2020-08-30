package company.search;

import java.util.Scanner;
/*顺序查找就是按顺序从头到尾依次往下查找，找到数据，
则提前结束查找，找不到便一直查找下去，直到数据最后一位。*
 *
 * */

public class 顺序查询 {
    public static void main(String args[]) {
        int[] a = new int[]{123, 433, 3, 54, 6, 45, 6, 78,};
        Scanner input = new Scanner(System.in);
        System.out.println("输入");
        int num = input.nextInt();
        int result = search(a, num);
        if (result == -1) {
            System.out.println("不存在");
        } else {
            System.out.println("niyaode zai " + (result + 1));
        }

    }

    public static int search(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                return i;
            }
        }
        return -1;

    }
}
