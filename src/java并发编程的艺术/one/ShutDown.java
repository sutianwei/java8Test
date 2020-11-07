package java并发编程的艺术.one;

import java.util.concurrent.TimeUnit;

public class ShutDown {
    public static void main(String[] args) throws InterruptedException {
        Runner one = new Runner();
        Thread countThread = new Thread(one, "countThread");
        countThread.start();

        //睡眠一秒，是的main中断countThread，是的countThread感知到中断而结束
        TimeUnit.SECONDS.sleep(1);
        countThread.interrupt();

        Runner two = new Runner();
        countThread = new Thread(two, "countThread2");
        countThread.start();
        //睡眠一秒，main对countThread进行cancel，countThead感知到on = false而结束
        TimeUnit.SECONDS.sleep(1);
        two.cancel();

    }

    private static class Runner implements Runnable {
        private long i;
        private volatile boolean on = true;

        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("i====" + i);

        }

        public void cancel() {
            on = false;
        }
    }
}
