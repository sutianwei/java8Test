package company.company;

public class A {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            sum = sum + i;
            if (i % 4 == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}
