package company.javathead;

import java.util.Arrays;

/**
 * @Author: sutianwei
 * @Date: 2019/5/26 15:41
 */
public class lambda {
    public static void main(String args[]) {
        String[] planets = new String[]{"ss", "dfs", "ssf", "sdfsdfds", "ggg"};
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets);
        System.out.println("怕思绪");
        System.out.println(Arrays.toString(planets));
        System.out.println("length");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
    }
}
