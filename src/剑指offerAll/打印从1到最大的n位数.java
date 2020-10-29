package 剑指offerAll;

public class 打印从1到最大的n位数 {
    public  static  int[] printNumbers(int n) {

        /**
         * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
         */


        /**主要是算出最大的那个数是多少*/
        int s= 0;
        for(int a=1;a<=n ;a++){
            s=s*10+9;
        }
        int [] a = new int[s];
        for (int m = 1;m<=s;m++){
            a[m-1]=m;
        }
        return  a;

    }

    public static void main(String[] args) {
        int num [] =printNumbers(2);
        for (int i : num) {
            System.out.println(i);

        }

        System.out.println(num.toString());
    }
}
