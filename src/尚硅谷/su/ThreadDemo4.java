package 尚硅谷.su;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * list 不安全
 */

public class ThreadDemo4 {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        Vector<String> list = new Vector<>();
//        List<String> list = Collections.synchronizedList(new ArrayList<>());
//        List<String> list = new CopyOnWriteArrayList<>();

//        for (int i = 0; i < 30; i++) {
//            new Thread(() -> {
//                list.add(UUID.randomUUID().toString().substring(0, 8));
//                System.out.println(list);
//            }, String.valueOf(i)).start();
//
//        }


        //hashset
//        Set<String> list = new CopyOnWriteArraySet<>();
//        Set<String> list = new HashSet<>();
//        for (int i = 0; i < 30; i++) {
//            new Thread(() -> {
//                list.add(UUID.randomUUID().toString().substring(0, 8));
//                System.out.println(list);
//            }, String.valueOf(i)).start();
//
//        }

        Map<String,String> list = Collections.synchronizedMap(new HashMap<>());
//        Set<String> list = new HashSet<>();
        for (int i = 0; i < 30; i++) {
            String key = String.valueOf(i);
            new Thread(() -> {
                list.put(key,UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();

        }


    }


}
