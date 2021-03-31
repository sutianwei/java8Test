package 狂神说.线程基础;

/**礼让不一定成功*/
public class TestField {

    public static void main(String[] args) {
        MyYield  myYield = new MyYield();
        new Thread(myYield,"A").start();
        new Thread(myYield,"B").start();
    }



}
class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程停止");
    }
}