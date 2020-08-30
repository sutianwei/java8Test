package company.多线程;

public class jointhread  extends   Thread {
    public static void main(String args[]) throws  Exception{
        jointhread  jo=new jointhread();
        Thread  thread=new Thread(jo);
        thread.start();
        for (int i = 0; i < 100; i++) {
            if (50==i){
                thread.join();
            }
            System.out.println("main..."+i);
        }
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("join..."+i);
        }
    }
}
