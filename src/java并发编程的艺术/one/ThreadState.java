package java并发编程的艺术.one;

public class ThreadState {
    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "TIME  WAITING").start();
        new Thread(new Waiting(), "waiting").start();
        //使用两个blockde线程，一个获取成功，一个阻塞

        new Thread(new Blocked(), "BLOCKED---1").start();
        new Thread(new Blocked(), "blocked --2").start();
    }


    //该线程不断进行睡眠
    static class TimeWaiting implements Runnable {
        @Override
        public void run() {
            while (true) {
                SleepUtils.second(100);
            }
        }
    }

    //该线程在waiting.class实例上等待
    static class Waiting implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (Waiting.class) {
                    try {
                        Waiting.class.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //该线程在Blocked.class实例上加锁，不会释放锁
    static class Blocked implements Runnable {
        @Override
        public void run() {
            synchronized (Blocked.class) {
                while (true) {
                    SleepUtils.second(100);
                }
            }
        }
    }
}
