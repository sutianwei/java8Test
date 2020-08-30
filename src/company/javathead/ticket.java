package company.javathead;


/**
 * @Author: sutianwei
 * @Date: 2019/5/27 21:58
 */
public class ticket {
    public static void main(String[] args) {
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();
    }
}

class Ticket extends Thread {
    private int ticket1 = 100;

    public void run() {
        while (true) {
            if (ticket1 == 0) {
                break;
            }
            System.out.println(getName() + "di  --" + ticket1-- + "飘走");
        }
    }
}


