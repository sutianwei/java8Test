package myown;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java并发编程的艺术.线程池.SemaphoreTest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class test {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);









        BigDecimal a1 = new BigDecimal(11);
        BigDecimal a2 = new BigDecimal("12.22");
        BigDecimal a3 = BigDecimal.TEN;

        System.out.println(a1.add(a2));
        System.out.println(a1.subtract(a2));
        System.out.println(a1.subtract(a2).abs());
        System.out.println(a1.multiply(a2));
        System.out.println(a1.divide(a2,2, RoundingMode.HALF_DOWN));



    }

    public  static List<Integer> query(String str) {
        int m = str.length() / 2;
        if (m * 2 < str.length()) {
            m++;
        }
        String[] strs = new String[m];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {//每隔两个
                strs[j] = "" + str.charAt(i);
            } else {
                strs[j] = strs[j] + str.charAt(i);//将字符加上两个空格
                j++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            list.add(Integer.valueOf(strs[i]));
        }
        return list;
    }

    public static HashMap get(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a : arr) {
            if (map.containsKey(a))//map的containsKey()用于判断当前map是否含有元素key=i对应的value值
            {
                int val = map.get(a);//map的get方法是获取当前元素key=i的value值
                val++;
                map.put(a, val);//将value值加一后利用map的put方法放入原map中
            } else {
                map.put(a, 1);//若当前map中没有key=i对应的value值则将其put到map中，且令其value=1；当再次遇到相同元素则执行if操作
            }
        }
        return map;
    }

}
