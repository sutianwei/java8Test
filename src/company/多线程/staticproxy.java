package company.多线程;

/*
 * 使用runnable接口
 * */
public class staticproxy implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("一边吃一边说");
        }
    }
}
