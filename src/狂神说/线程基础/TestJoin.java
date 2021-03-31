package 狂神说.线程基础;

public class TestJoin implements Runnable{

    public static void main(String[] args) throws InterruptedException {

        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        for (int i = 0; i <500 ; i++) {
            if (i==200){
                    thread.join();
            }
            System.out.println("main +"+i);
        }

    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("vip __"+i+"来了");
        }
    }
}
