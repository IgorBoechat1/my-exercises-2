package io.codeforall.fanstatics;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    private final int PORT = 8080;
    private ArrayList<Client> list;

    public Server() {
        this.list = new ArrayList<>();
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.bindSocket();
    }

    public void bindSocket() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                Client clientHandler = new Client(clientSocket, list);
                list.add(clientHandler);
                new Thread(clientHandler).start();
                System.out.println("Cliente conectado");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
