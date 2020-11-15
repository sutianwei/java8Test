package java并发编程的艺术.多线程编程核心技术.a1;

public class Run3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(5000000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }


            }.start();
        }
    }
}
