package 尚硅谷.su;


/**
 * 3个线程买30个票
 *
 * 1: 创建资源类+属性+操作
 */

class Ticket {
    private int number = 30;

    public synchronized void sale() {
        //买 票
        if (number > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出票" + (number--) + "剩下" + number);

        }
    }


}

public class SaleTicket {

    public static void main(String[] args) {
        //1 创建对象
        Ticket ticket = new Ticket();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticket.sale();
                }
            }
        }, "AA").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticket.sale();
                }
            }
        }, "BB").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticket.sale();
                }
            }
        }, "CC").start();


    }


}
