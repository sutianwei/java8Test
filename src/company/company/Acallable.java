package company.company;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


class MyThread2 implements Callable<Integer> {
    public Integer call() throws Exception {
        System.out.println("come in ");
        return 1024;
    }
}


public class Acallable {
    public static void main(String args[]) throws Exception {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread2());

        Thread t1 = new Thread(futureTask, "aa");
        t1.start();

        int result01 = 100;
        int result02 = futureTask.get();

        System.out.println("result " + futureTask.get());
    }

}
