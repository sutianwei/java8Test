package 尚硅谷.su;

import java.util.concurrent.locks.ReentrantLock;

class LTicket {

    private int number = 30;

    private final ReentrantLock lock = new ReentrantLock(true);

    public void sale() {
        try {
            lock.lock();
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出" + (number--) + "剩余" + number);
            }
        } finally {
            lock.lock();
        }
    }


}


public class LSaleTicket {
    public static void main(String[] args) {

        LTicket ticket = new LTicket();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "AA").start();


        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();

            }
        }, "BB").start();


        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();

            }
        }, "CC").start();
    }

}
