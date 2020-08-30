package company.面试基础.Java阻塞队列实现生产者和消费者;



import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue q) {
        queue = q;
    }


    private void consumer(Integer n) {
        System.out.println("THrea" + Thread.currentThread().getId() + "consum" + n);
    }


    @Override


    public void run() {
        while (true) try {
            Thread.sleep(1000);
            consumer(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
