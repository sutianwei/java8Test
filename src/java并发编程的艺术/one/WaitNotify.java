package java并发编程的艺术.one;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread waitThread = new Thread(new Wait(), "wait thread");
        waitThread.start();
        TimeUnit.SECONDS.sleep(1);
        Thread notifyThread = new Thread(new Notify(), "notify thread");
        notifyThread.start();
    }

    static class Wait implements Runnable {
        @Override
        public void run() {
            //加锁，拥有lock的monitor
            synchronized (lock) {
                while (flag) {
                    try {
                        System.out.println(Thread.currentThread() + "flag is true,wait___" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                        lock.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                //条件满足时，完成工作

                System.out.println(Thread.currentThread() + "flag is false，running___" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        }
    }

    static class Notify implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                //获取锁，然后通知，通知的时不会释放锁
                //直到当前线程释放了锁，waitThread才能从wait中返回
                System.out.println(Thread.currentThread() + "hold  lock。notify___" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag = false;
                SleepUtils.second(5);
            }
            //再次加锁
            synchronized (lock) {
                System.out.println(Thread.currentThread() + "hold  lock again。notify___" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                SleepUtils.second(5);

            }
        }
    }




}
