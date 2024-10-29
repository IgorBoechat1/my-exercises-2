package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;


public class Client implements Runnable {

    private Socket socket;


    public Client(Socket socket, ArrayList list) throws IOException {
        this.socket = socket;
    }

    public void run() {


        String inputLine;

            while (true) {
                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                    if (!((inputLine = in.readLine()) != null)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Message received from client: " + inputLine);


            }
        }
    }
