package company.面试基础;

public class SingleDemo {
    public static void main(String args[]) {

//        System.out.println(SingleDemo.getInstance() == SingleDemo.getInstance());
//        System.out.println(SingleDemo.getInstance() == SingleDemo.getInstance());
//        System.out.println(SingleDemo.getInstance() == SingleDemo.getInstance());
        //并发多线程
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingleDemo.getInstance();
            }, String.valueOf(i)).start();
        }
    }

    private static volatile SingleDemo instance = null;

    private SingleDemo() {
        System.out.println(Thread.currentThread().getName() + "\t我是singleton");
    }

    //双端检索机制
    public static SingleDemo getInstance() {
        if (instance == null) {
            synchronized (SingleDemo.class) {
                if (instance == null) {
                    instance = new SingleDemo();
                }
            }
        }
        return instance;
    }

}
