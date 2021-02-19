package 剑指offerAll;

public class 求1234相加 {

    public static int sum(int n) {

        boolean x = n > 1 && (n = n + sum(n - 1)) > 0;
        return n;

    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
