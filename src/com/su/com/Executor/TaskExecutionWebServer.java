package com.su.com.Executor;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TaskExecutionWebServer {

    private static final int NTHREADS = 100;

    private static final Executor exec = Executors.newFixedThreadPool(NTHREADS);

    public static void main(String args[]) throws Exception {
        ServerSocket socket = new ServerSocket(80);
        while (true) {
            final Socket connection = socket.accept();
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    //处理请求
//                    handleRequest(connection);
                }
            };
            exec.execute(task);
        }
    }

}
