package com.su.com;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Dish2 {

    public static void main(String[] args) {


        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("BEEF", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("price", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));

        /*选取calories大于300的鱼的名字*/
        List<String> threeHighCaloriesFish = menu.stream()
                .filter(d->d.getName()=="pork")
//                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(4)
                .collect(toList());

        System.out.println("选取calories大于300的4个食物的名字"+threeHighCaloriesFish);//[pork, BEEF, chicken]

        /*流只能遍历一次*/
        List<String> title=Arrays.asList("java8","In","Action");
        Stream<String> s=title.stream();
        s.forEach(System.out::println);//java8 In Action
//        s.forEach(System.out::println);//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

        /*外部循环*/
        List<String> names=new ArrayList<>();
        //添加对象
        for (Dish d:menu){
            names.add(d.getName());
        }

        //用迭代器
        List<String> namess=new ArrayList<>();
        Iterator<Dish> iterator=menu.iterator();
        while (iterator.hasNext()){
            Dish d=iterator.next();
            namess.add(d.getName());
        }

        /*内部迭代*/
        List<String> names2=menu.stream()
                .map(Dish::getName)
                .collect(toList());


        menu.stream().forEach(System.out::println);

        List<Integer>  numbers=Arrays.asList(1,2,1,3,3,2,4,6);
        numbers.stream().filter(i->i%2==0)
                //去除重复的数字
                .distinct()
                .forEach(System.out::println);

        //跳过元素
        List<Dish> dishes=menu.stream()
                .filter(ss->ss.getCalories()>300)
                .skip(3)
                .collect(toList());

       /*显示每个字母的长度*/
      List<String>  words=Arrays.asList("Java8","lamda","in","action");
      List<Integer>  wordlength=words.stream()
              .map(String::length)
              .collect(toList());
        System.out.println(wordlength);//[5, 5, 2, 6]

        List<Integer>  dishLength=menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(dishLength);//[4, 4, 7, 12, 5, 12, 5, 6, 6]



    }
}