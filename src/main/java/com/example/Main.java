package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {


        ServerSocket ss = new ServerSocket(1234);

        do {
            Socket s = ss.accept();

            System.out.println("il client si è collegato");

            MyThread t  = new MyThread(s);

            t.start();
        } while (true);








    





    }
}