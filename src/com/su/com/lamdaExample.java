package com.su.com;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
//import java.util.List;

public class lamdaExample {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("java8z之前的Runnable");
            }
        }).start();

        new Thread(() -> System.out.println("java8之后的Runnable")).start();


        /**
         * 对列表进行迭代
         */
        List fertures = Arrays.asList("lamda", "Default", "Stream  API");
        //java 8 之后
        fertures.forEach(n -> System.out.println(n+"1"));

        fertures.forEach(System.out::println);

        //java 8之前
        for (Object item : fertures) {
            System.out.println(item);
        }


        //计算集合最大值、最小值、总和、平均值
        List<Integer> prime=Arrays.asList(2,3,4,5,8,12,56,6786);
        IntSummaryStatistics stats=prime.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("Higest  is "+ stats.getMax());
        System.out.println("Lowerest  is "+ stats.getMin());
        System.out.println("sum  is "+ stats.getSum());
        System.out.println("平均分  is "+ stats.getAverage());
    }

}
