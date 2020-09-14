package 剑指offer.easyLevel;

public class 求和 {
    public static int Add(int num1,int num2) {

        while(num2!=0){
            int carry = (num1&num2)<<1;//进位。即二进制与，再左移
            num1 = num1^num2;//直接相加，不考虑进位。即二进制异或操作
            num2 = carry;    //num2作为进位
        }
        return num1;

    }

    public static void main(String[] args) {
        System.out.println(Add(1,2));
    }
}
