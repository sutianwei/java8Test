package company.javathead;

/**
 * @Author: sutianwei
 * @Date: 2019/5/27 21:12
 */
public class thread1 {
    public static void main(String args[]) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + "ssssss");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + "----------");
                }
            }
        };
//        t1.setPriority(10);
//        t2.setPriority(1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
