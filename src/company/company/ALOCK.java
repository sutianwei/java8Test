package company.company;

import java.util.concurrent.TimeUnit;

class HoldLock implements Runnable {
    private String lockA;
    private String lockB;


    public HoldLock(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "\t 自己chiyouo" + lockA + "changshi" + lockB);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        synchronized (lockB) {
            System.out.println(Thread.currentThread().getName() + "\t 自己chiyouo" + lockB + "changshi" + lockA);


        }
    }

}

public class ALOCK {
    //    思索
    public static void main(String args[]) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(() -> {
            new HoldLock(lockA, lockB);
        }, "AAA").start();
        new Thread(() -> {
            new HoldLock(lockA, lockB);
        }, "BBB").start();
    }
}
