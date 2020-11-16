package java并发编程的艺术.线程池;



public interface ThreadPool<Job extends Runnable> {

    //执行一个job这个job需要实现runnable
    void execute(Job job);

    //关闭线程池
    void shutdown();

    //增加工作者线程
    void addWorkers(int num);

    //减少工作者线程
    void deleteWorkers(int num);

    //获取正在等待执行的线程的数量
    int getJobSize();

}
