package 尚硅谷.su;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Share2 {
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void incr() {
        lock.lock();
        try {
            while (number != 0) {
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "====" + number);
            condition.signalAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decr() {
        lock.lock();
        try {
            while (number != 1) {
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "====" + number);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class ThreadDemo2 {

    public static void main(String[] args) {
        Share2 share2 = new Share2();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share2.incr();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, "AA").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share2.decr();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, "BB").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share2.decr();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, "CC").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share2.incr();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, "DD").start();
    }

}
