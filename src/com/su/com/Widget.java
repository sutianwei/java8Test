package com.su.com;

public class Widget {

    public synchronized void test() {
        //dosomething
    }
}

public class LoggingWidght extends Widget {
    public synchronized void testSyn() {
        System.out.println(toString + "calling doSomething");
        super.test();
    }
}
