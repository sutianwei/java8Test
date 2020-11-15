package java并发编程的艺术.多线程编程核心技术.a1;

public class Bserver  extends Aserver implements java.lang.Runnable {

    public void b(){
        System.out.println("BBBBB");
    }

    @Override
    public void run() {
        b();
    }

}
