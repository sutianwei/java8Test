package company.company;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareData {
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws Exception {
        lock.lock();
        try {
            while (number != 0) {
                condition.await();

            }
            number++;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            //通知唤醒
            condition.signalAll();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            {
                lock.unlock();
            }
        }
        //判断

    }

    public void deincrement() throws Exception {
        lock.lock();
        try {
            while (number == 0) {
                condition.await();

            }
            number--;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            //通知唤醒
            condition.signalAll();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            {
                lock.unlock();
            }
        }
        //判断

    }
}


public class Aproduce {
    public static void main(String args[]) {
        ShareData shareData = new ShareData();
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    shareData.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "AA").start();
        new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                try {
                    shareData.deincrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "BB").start();
    }
}
