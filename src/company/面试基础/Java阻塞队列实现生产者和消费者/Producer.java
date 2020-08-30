package company.面试基础.Java阻塞队列实现生产者和消费者;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue q) {
        this.queue = q;
    }


    @Override

    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                queue.put(produce());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    private int produce() {
        int n = new Random().nextInt(10000);
        System.out.println("THread" + Thread.currentThread().getId() + "produce" + n);
        return  n;
    }
}
