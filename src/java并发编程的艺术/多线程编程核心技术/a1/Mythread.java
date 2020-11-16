package java并发编程的艺术.多线程编程核心技术.a1;

public class Mythread extends Thread {
    @Override
    public void run() {
       for (int i=0;i<1000;i++){
        System.out.println("run == " +Thread.currentThread().getName());
    }}

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("777");
            }
        }).start();
    }
}
