package company.s5_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: sutianwei
 * @Date: 2019/5/14 12:14
 */
public class s514 {
    public  static  int [] fun1(int a[],int n, int target){
        int flag = 0xffff;
        int b[] =new int [2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                //System.out.println(a[i] + ";" + a[j]);
                int su = a[i] + a[j];

                if (su == target) {
                    System.out.println("第一个" + a[i] + "第二个" + a[j]);
                    int su2 = a[i] * a[j];
                    if (su2 < flag) {
                        flag = a[i] * a[j];
                        b[0] = a[i];
                        b[1] = a[j];
//                        System.out.println("ww" + b[0] + "ss" + b[1]);

                    }
                }
            }

        }
        return  b;
    }

    public  static  int [] fun2(int a[],int n, int target){
        Arrays.sort(a);
        int b[] =new int [2];
        int flag=0xffff;
        int left=0,right=n-1;
        while (left<right){
            if(a[left]+a[right]<target){
                left++;
            }else  if (a[left]+a[right]>target){
                right--;
            }else {
                int su2=a[left]*a[right];
                if (su2 < flag) {
                    flag = a[left] * a[right];
                    b[0] = a[left];
                    b[1] = a[right];
//                        System.out.println("ww" + b[0] + "ss" + b[1]);
                }
                left++;
            }

        }
        return  b;
    }
    public static void main(String args[]) {

        int a[] = {1, 5, 8, 2, 3, 7};

        int b[] = fun2(a,6,10);
        System.out.println("ww" + b[0] + "ss" + b[1]);

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

//        int b[] = new int[2];

    }
}
