package company.company;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Phone implements Runnable {
    public synchronized void sendSMS() throws Exception {
        System.out.println(Thread.currentThread().getId() + "\t  sms");
        sendEmail();
    }

    public synchronized void sendEmail() throws Exception {
        System.out.println(Thread.currentThread().getId() + "\t ############### email");
//dfssssssssssssssss
    }

    Lock lock = new ReentrantLock();

    public void run() {
        get();
    }

    public void get() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getId() + "\t  sms");
            set();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void set() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getId() + "\t ############### email");
//
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class aReenterLock {


    public static void main(String[] args) throws Exception {
        Phone phone = new Phone();
        new Thread(() -> {
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "t1").start();
        new Thread(() -> {
            try {
                phone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "t2").start();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Thread t3 = new Thread(phone,"3");
        Thread t4 = new Thread(phone,"4");
        t3.start();
        t4.start();
    }


}

