package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(5637);
        Socket myS = ss.accept();

        System.out.println("qualcuno si è collegato");
    }
}