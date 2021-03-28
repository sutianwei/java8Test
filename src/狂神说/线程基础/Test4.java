package 狂神说.线程基础;

public class Test4 implements Runnable {

    private int ticketNums = 10;


    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "get ticket" + ticketNums--);
        }
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        new Thread(test4, "1").start();
        new Thread(test4, "2").start();
        new Thread(test4, "3").start();
    }
}
