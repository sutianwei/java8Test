package java并发编程的艺术.one;

import java.util.concurrent.TimeUnit;

public class Interrupted {
    public static void main(String[] args) throws InterruptedException {
        //sleep尝试不断睡眠
        Thread sleep = new Thread(new Sleep(), "SLEEP");
        sleep.setDaemon(true);
        //sleep不停运行
        Thread busy = new Thread(new busy(), "busy");
        busy.setDaemon(true);

        sleep.start();
        busy.start();
        //休眠5秒
        TimeUnit.SECONDS.sleep(5);

        sleep.interrupt();
        busy.interrupt();

        System.out.println("sleep ---" + sleep.isInterrupted());
        System.out.println("busy ---" + busy.isInterrupted());

        SleepUtils.second(2);


    }

    static class Sleep implements Runnable {
        @Override
        public void run() {
            while (true) {
                SleepUtils.second(100);
            }
        }
    }


    static class busy implements Runnable {
        @Override
        public void run() {
            while (true) {

            }
        }
    }
}
