package java并发编程的艺术.多线程编程核心技术.a1;

import sun.awt.geom.AreaOp;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("name:"+Thread.currentThread().getName());
        System.out.println("priority:"+Thread.currentThread().getPriority());

    }
}
