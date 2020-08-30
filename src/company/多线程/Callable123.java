package company.多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable123 {
    public static void main(String args[]) throws Exception {
//        创建线程

        ExecutorService ser = Executors.newFixedThreadPool(2);
        Race race = new Race();
//        获取类对象
        Future<Integer> future = ser.submit(race);
        int num = future.get();
        System.out.println(num);
        ser.shutdown();
    }

}

class Race implements Callable<Integer> {
    public Integer call() throws Exception {
        return 1000;
    }

}
