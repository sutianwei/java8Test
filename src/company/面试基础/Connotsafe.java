package company.面试基础;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Connotsafe {
    public static void main(String args[]) {
        List<String> list = new CopyOnWriteArrayList<>();
//1 vector
        //2:collections.sychroinzed
        //3:CopyOnWriteArrayList

        for (int i = 1; i < 13; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
}
