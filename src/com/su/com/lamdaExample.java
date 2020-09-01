package com.su.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class lamdaExample {

    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test java8");
            }
        }).start();

        new Thread(() -> System.out.println("lamda方式")).start();

        System.out.println("_____________________________________________");


        List<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("python");
        languages.add("c");
        System.out.println("Languages which starts with J :");
        filter(languages, (str)->str.s("J"));

        System.out.println("Languages which ends with a ");
        filter(languages, (str)->str.endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str)->true);

        System.out.println("Print no language : ");
        filter(languages, (str)->false);

        System.out.println("Print language whose length greater than 4:");

        filter(languages, (str)->str.() > 4);
    }

    public static void filter(List<String> names, Predicate condition) {
        for (String ss : names) {
            if (condition.test(ss)) {
                System.out.println(ss + "6666");
            }
        }
    }

}
