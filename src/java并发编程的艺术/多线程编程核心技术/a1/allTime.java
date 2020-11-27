package java并发编程的艺术.多线程编程核心技术.a1;


public class allTime {

    private static  long now =System.currentTimeMillis();


    private static long get1(){
        System.out.println(now);
        return System.currentTimeMillis();
    }

    private static long get2(){
        System.out.println(now);
        return System.currentTimeMillis();
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("1-----"+get1());
        Thread.sleep(2000);
        System.out.println("2----"+get2());
        Thread.sleep(2000);
        System.out.println(now);

    }
}
