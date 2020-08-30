package company.剑指offer;

import java.util.Scanner;

/*
* 寻找第k个数字
*
* */
public class TheKNum {
    public   static  Integer  find(int a[],int k){
        if (k>a.length||k<=0){
            return  null;
        }
        int i=0;
        int j=k;
        while (j!=a.length){
            i++;
            j++;
        }
        return  a[i];
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();
        System.out.println(find(arr,m));
    }
}
