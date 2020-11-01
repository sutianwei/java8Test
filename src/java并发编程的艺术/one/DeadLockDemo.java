package java并发编程的艺术.one;

public class DeadLockDemo {
    private static String A = "A";
    private static String B = "BA";

    public static void main(String[] args) {
        DeadLockDemo.dedaLock();
    }

    public  static void dedaLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("1");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
            synchronized (B){
                synchronized (A){
                    System.out.println("2");
                }
            }
            }
        });
        t1.start();
        t2.start();

    }
}
