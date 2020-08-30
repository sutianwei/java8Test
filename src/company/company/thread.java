package company.company;

public class thread {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread() {
            public void run() {
                synchronized (lock1) {
                    System.out.println("1  get 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2) {
                        System.out.println("1get 2");
                    }
                }
                System.out.println("1  ened");
            }

        }.start();
        new Thread() {
            public void run() {
                synchronized (lock2) {
                    System.out.println("2  get 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1) {
                        System.out.println("2  get 1");
                    }
                }
                System.out.println("2  end");
            }
        }.start();
    }

}
