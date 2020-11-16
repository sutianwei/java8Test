package java并发编程的艺术.多线程编程核心技术.a1;

public class Mythread5 extends Thread {

    private int count = 5;
//    public Mythread5(String name){
//        super();
//        this.setName(name);
//    }

//    @Override
//     public void run() {
//        super.run();
//        count--;
//        System.out.println("这个"+Thread.currentThread().getName()+"计算"+count);
//    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("这个" + Thread.currentThread().getName() + "计算" + count);
        }
    }


    public static void main(String[] args) {

//        Mythread5 a = new Mythread5("A");
//        Mythread5 b = new Mythread5("b");
//        Mythread5 c = new Mythread5("c");
//        Mythread5 d = new Mythread5("d");
//        Mythread5 e = new Mythread5("e");
//
//        a.start();
//        b.start();
//        c.start();
//        d.start();
//        e.start();
        Mythread5 mythread5 = new Mythread5();
        Thread a = new Thread(mythread5, "A");
        Thread b = new Thread(mythread5, "b");
        Thread c = new Thread(mythread5, "c");
        Thread d = new Thread(mythread5, "d");
        Thread e = new Thread(mythread5, "e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }
}
