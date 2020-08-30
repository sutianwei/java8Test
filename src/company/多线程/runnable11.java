package company.多线程;

public class runnable11 {
    public static void main(String[] args) {
        runnable1 run = new runnable1();
        run.start();//调用对象.start
        wugui wu = new wugui();
        wu.start();
    }
}
