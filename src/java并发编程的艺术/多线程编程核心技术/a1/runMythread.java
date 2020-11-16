package java并发编程的艺术.多线程编程核心技术.a1;

public class runMythread {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.setName("自己的thread");
        mythread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main = " + Thread.currentThread().getName());
        }
    }}
