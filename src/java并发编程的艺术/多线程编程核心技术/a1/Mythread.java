package java并发编程的艺术.多线程编程核心技术.a1;

public class Mythread extends Thread {

@Override
    public void run() {
       for (int i=0;i<500000;i++){
        System.out.println("run == " +(i+1));
    }}

    public static void main(String[] args) throws InterruptedException {


        Mythread  th =new Mythread();
        th.start();
        Thread.sleep(2000);
        th.interrupt();
        System.out.println("222222222222222222");
    }
}
