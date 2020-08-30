package company.company;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

class MyCache {
    private volatile Map<String, Object> map = new HashMap<>();

    public void put(String key, String value) {
        System.out.println(Thread.currentThread().getName() + "\t  zhegnzi写入" + key);
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put(key, value);


        System.out.println(Thread.currentThread().getName() + "\t写入完成");
    }

    public void get(String key) {
        System.out.println(Thread.currentThread().getName() + "\t  zhegnzi读取" + key);
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (Exception er) {
            er.printStackTrace();
        }
        Object result = map.get(key);


        System.out.println(Thread.currentThread().getName() + "\tduqu 完成");
    }


}


public class Amycache {
    public static void main(String args[]) {
        MyCache myCache = new MyCache();
        for (int i = 1; i < 5; i++) {
            final int tempint = i;
            new Thread(() -> {

                myCache.put(tempint + "", tempint + "");
            }, String.valueOf(i)).start();
        }

        for (int i = 1; i < 5; i++) {
            final int tempint = i;
            new Thread(() -> {

                myCache.get(tempint + "");
            }, String.valueOf(i)).start();
        }
    }

}
