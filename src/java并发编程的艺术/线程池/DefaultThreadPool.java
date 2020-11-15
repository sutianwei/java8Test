package java并发编程的艺术.线程池;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DefaultThreadPool<Job extends Runnable> implements ThreadPool<Job> {


    //线程池最大限制数
    private static final int MAX_WORKER_NUMBERS = 10;

    //线程池默认数
    private static final int DEFAULT_WORKER_NUMBERS = 5;

    //线程池最小限制数
    private static final int MIN_WORKER_NUMBERS = 1;

    //工作列表
    private final LinkedList<Job> jobs = new LinkedList<>();

    //工作者列表
    private final List<Worker> workers = Collections.synchronizedList(new ArrayList<Worker>());

    //工作者线程的数量
    private int workerNum = DEFAULT_WORKER_NUMBERS;

    //线程编号id
    private AtomicLong threadNum = new AtomicLong();

    public DefaultThreadPool() {
        initalizedWorkers(DEFAULT_WORKER_NUMBERS);
    }

    public DefaultThreadPool(int num) {
        workerNum = num > MAX_WORKER_NUMBERS ? MAX_WORKER_NUMBERS :
                num < MIN_WORKER_NUMBERS ? MIN_WORKER_NUMBERS : num;
        initalizedWorkers(workerNum);
    }

    //初始化线程工作者
    private void initalizedWorkers(int num) {
        for (int i = 0; i < num; i++) {
            Worker worker = new Worker();
            workers.add(worker);
            Thread thread = new Thread(worker, "pool--worker--" + threadNum.incrementAndGet());
            thread.start();
        }
    }

    class Worker implements Runnable {

        //是否工作
        private volatile boolean running = true;

        @Override
        public void run() {
            while (running) {
                Job job = null;
                synchronized (jobs) {
                    //如果工作者列表是空的，就wait
                    while (jobs.isEmpty()) {
                        try {
                            jobs.wait();
                        } catch (Exception e) {
                            //感知到外部对workerThrad的中断操作，返回
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    job = jobs.removeFirst();
                }
                if (job != null) {
                    try {
                        job.run();
                    } catch (Exception e) {
                        //ignore
                    }
                }
            }
        }

        public void shutdown() {
            running = false;
        }
    }

    @Override
    public void execute(Job job) {
        if (job != null) {
            synchronized (jobs) {
                jobs.addLast(job);
                job.notify();
            }
        }
    }

    @Override
    public void shutdown() {
        for (Worker worker : workers) {
            worker.shutdown();
        }
    }

    @Override
    public void addWorkers(int num) {
        synchronized (jobs) {
            if (num + this.workerNum > MAX_WORKER_NUMBERS) {
                num = MAX_WORKER_NUMBERS  - this.workerNum;
            }
            initalizedWorkers(num);
            this.workerNum += num;
        }
    }

    @Override
    public void deleteWorkers(int num) {
        synchronized (jobs) {
            if (num >= this.workerNum) {
                throw new IllegalArgumentException("超过数量了");
            }
            //按照给定数量停止worker
            int count = 0;
            while (count < num) {
                Worker worker = workers.get(num);
                if (workers.remove(worker)) {
                    worker.shutdown();
                    count++;
                }
            }
            this.workerNum -=num;
        }
    }

    @Override
    public int getJobSize() {
        return jobs.size();
    }


}
