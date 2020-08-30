package company.面试基础;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class MyData {
    volatile int num = 0;//主内存

    public void addTo60() {
        this.num = 60;//变化
    }

    public void addPlusPlus() {
        num++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();

    public void addAtomic() {
        atomicInteger.getAndIncrement();
    }
}

/*
 * 验证volicate可见性
 * */
public class VolatileDemo {
    public static void main(String args[]) {
        MyData myData = new MyData();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    myData.addPlusPlus();
                    myData.addAtomic();
                }
            }, String.valueOf(i)).start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + "\t value is " + myData.num);
        System.out.println(Thread.currentThread().getName() + "\t  ato value is " + myData.atomicInteger);
    }

    public static void seeOKByVolatile() {
        MyData myData = new MyData();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t  come in ");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.addTo60();
            System.out.println(Thread.currentThread().getName() + "\t  update  value  " + myData.num);
        }, "AAA").start();
        //第二个线程
        while (myData.num == 0) {

        }
        System.out.println(Thread.currentThread().getName() + "\t  mission is over" + myData.num);
    }
}
