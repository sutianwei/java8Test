package company.company;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arr {
    public static void main(String args[]) {
//        List<String> list = Arrays.asList("a","s","d");
//        list.forEach(System.out::println);
//集合不安全  用Collectionsl的安全类
//CopyOnWriteArrayLis写时复制
        List<String> list = new CopyOnWriteArrayList<>();
//list/hashset/hashmap

        for (int i = 1; i <= 3; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
}
