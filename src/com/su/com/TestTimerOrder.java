package com.su.com;

import org.junit.Test;

public class TestTimerOrder {
    public  static void main(String[] args) {
        final long timeInteral =1000;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + "tuime--- seconds");
                    try {
                        Thread.sleep(timeInteral);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
