package 剑指offer.easyLevel;

/*一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法*/


import company.javathead.List;

import java.util.ArrayList;

public class 跳台阶 {

    String  s=String.join("22","33");


    /*跳上n阶台阶，可以从n-1 跳一个上去，也可以从n-2 跳两个上去
     *  f（n）=f(n-1)+f(n-2)
     */
    public static int jump(int target) {
        if (target < 3) {
            return target;
        }
        int a = 1, b = 2;
        for (int i = 3; i <= target; ++i) {
            b = a + b;
            a = b - a;
        }
        return b;

    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(jump(n));
        System.out.println(1<<30);

        ArrayList<String> names=new ArrayList<>();
        names.add("1");

        names.add("2");

        names.add("3");
        System.out.println(names);
        System.out.println(String.join("-", names));
    }


}

