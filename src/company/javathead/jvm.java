package company.javathead;

/**
 * @Author: sutianwei
 * @Date: 2019/5/25 23:39
 */
public class jvm {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.run();
        for (int i = 0; i < 1000; i++) {
            System.out.println("bb");
        }
    }
}

class Demo extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("aaaaaaa");
        }
    }

}

