package com.su.com;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class testExecuor {
    public static void main(String args[]) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "666");
            }
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable, 1000L, 3000L, TimeUnit.MILLISECONDS);
    }


    /**
     * 用给定的参数创建一个新的ThreadPoolExecutor
     *
     */
    
}