package company.javathead;

/**
 * @Author: sutianwei
 * @Date: 2019/5/27 18:53
 */
public class thread {


    public static void main(String args[]) {
        new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("sssss");
                }
            }
        }.start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("sdsdsdsdsdsd");
                }
            }

        }).start();
    }
}

