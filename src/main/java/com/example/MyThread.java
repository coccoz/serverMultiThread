package com.example;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyThread extends Thread
{
    private Socket s;

    public MyThread(Socket s) 
    {
        this.s = s;
    }

    public void run()
    {
        try {
            System.out.println("server in avvio");

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            String recivedString = in.readLine();
            System.out.println("stringa ricevuta: " + recivedString);

            String upperRecivedString = recivedString.toUpperCase();
            out.writeBytes(upperRecivedString + "\n");

            s.close(); 
        } catch (Exception e) {
            System.out.println("errore");
        }
    }
}

