package java并发编程的艺术.多线程编程核心技术.a1;

public class Runnable  implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println(8787);
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable();
        runnable.run();

    }
}
