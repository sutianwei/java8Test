package company.company;

import java.util.Arrays;

/**
 * @Author: sutianwei
 * @Date: 2019/5/21 17:34
 */
public class addtwo {
    public static void main(String args[]) {
        int[] num1 = new int[]{14,22,33,45,65,78};
        int[] num2 = new int[]{1,35,56,85,564};
        int[] num3 = new int[num1.length + num2.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < num3.length; i++) {
            if (a < num1.length && b < num2.length) {
                if (num1[a] > num2[b]) {
                    num3[i] = num2[b];
                    b++;
                } else {
                    num3[i] = num1[a];
                    a++;
                }

            } else if (a < num1.length) {
                num3[i] = num1[a];
                a++;
            } else if (b < num2.length) {
                num3[i] = num2[b];
                b++;

            }
        }

        System.out.println(Arrays.toString(num3));
    }
}
