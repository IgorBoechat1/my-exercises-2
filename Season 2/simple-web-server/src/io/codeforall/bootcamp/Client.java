package io.codeforall.bootcamp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client implements Runnable {



    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Estava a dormir, mas acordaram-me!!!");
            e.printStackTrace();
        }

    }
}
