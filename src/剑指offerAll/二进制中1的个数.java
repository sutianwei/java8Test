package 剑指offerAll;

public class 二进制中1的个数 {
    public static int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        int sum=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='1'){
                sum++;
            }
        }
        return  sum;
    }


    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(9));
        System.out.println(hammingWeight(9));
    }
}
