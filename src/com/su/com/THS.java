package com.su.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class THS {

    public static void main(String[] args) {
        List<Apple> list=new ArrayList<>();
        Apple  apple =new Apple();
        apple.setColor("red");
        apple.setWeight("12");

        Apple  apple1 =new Apple();
        apple1.setColor("red");
        apple1.setWeight("12");

        Apple  apple2 =new Apple();
        apple2.setColor("22");
        apple2.setWeight("2");

        list.add(apple1);
        list.add(apple2);
        list.add(apple);

        System.out.println(      list.stream().collect(Collectors.toCollection(()->
                new TreeSet<>(Comparator.comparing(o->o.getColor())))).size());
    }


}
