package java并发编程的艺术.one;

public class Synchorized {
    public static void main(String[] args) {
        synchronized (Synchorized.class) {

        }
        m();
    }

    public static synchronized void m() {

    }

}
