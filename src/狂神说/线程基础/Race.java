package 狂神说.线程基础;

public class Race implements Runnable {

    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (Thread.currentThread().getName().equals("su")){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            boolean flag = gameover(i);
            if (flag){
                break;
            }

            System.out.println(Thread.currentThread().getName() + "-->跑了" + i + "路");

        }
    }

    private boolean gameover(int step) {
        if (winner != null) {
            return true;
        }
        {
            if (step >= 100) {
                winner=Thread.currentThread().getName();
                System.out.println("win is "+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"su").start();
        new Thread(race,"nie").start();
    }
}
