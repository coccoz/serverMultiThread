package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("server in avvio");

        ServerSocket server = new ServerSocket(3000);
        Socket myS = server.accept();

        System.out.println("qualcuno si è collegato");

        BufferedReader in = new BufferedReader(new InputStreamReader(myS.getInputStream()));
        DataOutputStream out = new DataOutputStream(myS.getOutputStream());

        String recivedString = in.readLine();
        System.out.println("stringa ricevuta: " + recivedString);

        String upperRecivedString = recivedString.toUpperCase();
        out.writeBytes(upperRecivedString + "\n");

        myS.close();
        server.close();



    }
}