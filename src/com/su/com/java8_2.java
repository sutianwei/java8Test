package com.su.com;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

public class java8_2 {

    public static void main(String[] args) {

    }

    /*lamda实现runnable*/
    public void Runnable () {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("old method");
                }
            }).start();
           new Thread(()-> System.out.println("new method")).start();
        }


}