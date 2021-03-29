package 狂神说.线程基础;

public class TestThread3 implements Runnable {


    @Override
    public void run() {
        // run
        for (int i = 0; i <20 ; i++) {
            System.out.println("看电视"+i);

        }
    }

    public static void main(String[] args) {
        //主线程
       TestThread3 testThread3 = new TestThread3();
      new Thread(testThread3).start();

        for (int i = 0; i <2000 ; i++) {
            System.out.println("thread"+i);

        }
    }
}
