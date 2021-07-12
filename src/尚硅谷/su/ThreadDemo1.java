package 尚硅谷.su;


/**
 * 1:资源类
 */

class Share {
    private int number = 0;

    public synchronized void incr() throws InterruptedException {
        // 判断  干活 通知
        while (number != 0) {
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + ":::" + number);
        // 通知其他
        this.notifyAll();
    }

    public synchronized void decr() throws InterruptedException {
        // 判断  干活 通知
        while (number != 1) {
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + ":::" + number);
        // 通知其他
        this.notifyAll();
    }

}

public class ThreadDemo1 {

    public static void main(String[] args) {
        Share share = new Share();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.incr();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, "AA").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.decr();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, "BB").start();
//
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.incr();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, "CC").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.decr();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, "DD").start();
    }

}
