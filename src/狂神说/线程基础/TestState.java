package 狂神说.线程基础;

public class TestState {


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("/////");
        });

        //new
        Thread.State state = thread.getState();
        System.out.println(state);
        //start
        thread.start();
        state=thread.getState();
        System.out.println(state);

        while (state != Thread.State.TERMINATED){

            Thread.sleep(2000);
            state=thread.getState();
            System.out.println(state);
        }
        thread.start();

    }
}
