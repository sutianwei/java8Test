package company.company;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class MyResource {
    private volatile boolean FLAG = true;
    private AtomicInteger atomicInteger = new AtomicInteger();
    BlockingQueue<String> blockingQueue = null;

    public MyResource(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
        System.out.println(blockingQueue.getClass().getName());
    }

    public void myprod() throws Exception {
        String data = null;
        boolean retValue;
        while (FLAG) {
            data = atomicInteger.incrementAndGet() + "";
            retValue = blockingQueue.offer(data, 2L, TimeUnit.SECONDS);
            if (retValue) {
                System.out.println(Thread.currentThread().getName() + "\t插入队列" + data + "ok");
            } else {
                System.out.println(Thread.currentThread().getName() + "\t插入队列" + data + "false");

            }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println(Thread.currentThread().getName() + "\t大老板叫停了");
    }

    public void myCounm() throws Exception {
        String result = null;
        while (FLAG) {
            result = blockingQueue.poll(2L, TimeUnit.SECONDS);
            if (null == result || result.equalsIgnoreCase("")) {
                FLAG = false;
                System.out.println(Thread.currentThread().getName() + "\t超时");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                return;
            }
            System.out.println(Thread.currentThread().getName() + "\t 读取队列" + result + "ok");


        }
    }

    public void stop() {
        try {
            this.FLAG = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


public class ProdConsumer_block {
    public static void main(String args[]) {
        MyResource myResource = new MyResource(new ArrayBlockingQueue<>(10));
        new Thread(() -> {
            try {
                myResource.myprod();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "prod").start();
        new Thread(() -> {
            try {
                myResource.myCounm();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "conmsume").start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("5时间到   大老板叫停");
        myResource.stop();

    }
}
