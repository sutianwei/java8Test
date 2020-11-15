package java并发编程的艺术.one;

public class Join {


    public static void main(String[] args) {
        Thread previous = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            //每个线程拥有前一个线程的引用，需要等前一个线程终止，才能从等待中返回
            Thread thread = new Thread(new Demino(previous), String.valueOf(i));
            thread.start();
            previous = thread;
        }
    }


    static class Demino implements Runnable {
        private Thread thread;

        public Demino(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                thread.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "终止了");
        }
    }
}
