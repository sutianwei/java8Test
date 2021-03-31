package 狂神说.线程基础;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class TestStop implements Runnable{


    private Boolean flag =true;
    @Override
    public void run() {
        int i =0;
        while (flag){
            System.out.println("thread +" +i++);
        }
    }

    public void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TestStop  testStop = new TestStop();
        new Thread(testStop).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("mian++"+i);
            if (i==900){
                testStop.stop();
                System.out.println("stop");
            }

        }
    }
}
