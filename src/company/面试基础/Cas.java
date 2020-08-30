package company.面试基础;

import java.util.concurrent.atomic.AtomicInteger;

public class Cas {
    public static void main(String args[]) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5, 12) + "32" + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5, 123123) + "32" + atomicInteger.get());
        atomicInteger.getAndIncrement();

    }

}
