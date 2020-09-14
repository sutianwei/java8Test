package 剑指offer.easyLevel;

public class 构建乘积数组 {

    /*
    * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
    * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
    * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
    */
    public static int[] multiply(int[] A) {
        if(A == null || A.length == 0) return null;
        int len = A.length;
        int[] B = new int[len];
        B[0] = 1;
        for(int i = 1; i <= len - 1; i++) {
            B[i] = B[i - 1] * A[i - 1];
        }
        int tmp = 1;
        for(int i = len - 2; i >= 0; i--) {
            tmp *= A[i + 1];
            B[i] *= tmp;
        }

        return B;
    }

    public static void main(String[] args) {
        int [] a={1,2,3,4};
        int [] b=multiply(a);
        for (int num :b){
            System.out.println(num);
        }
    }
}
