/* package io.codeforall.fanstatics;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.sound.sampled.Port;

public class Server {

    private final int PORT = 8080;
    private ArrayList<Client> list;
    private ExecutorService fixedPool;

    public Server(int PORT) {
        this.list = new ArrayList<>();
        fixedPool = Executors.newFixedThreadPool(numThreads);

        
    }

    public static void main(String[] args) {
        Server server = new Server(8080);
        server.bindSocket();
    }

    public void bindSocket() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                Client client = new Client(clientSocket, list);
                list.add(client);
               fixedPool.submit(client);
                System.out.println("Cliente conectado");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    
    

}
 */
package io.codeforall.fanstatics;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private int port;
    private ArrayList<Client> clients; // Use a more descriptive name
    private ExecutorService fixedPool;

    public Server(int port) {
        this.clients = new ArrayList<>(); // Initialize clients list
        fixedPool = Executors.newFixedThreadPool(10); // Assuming 10 threads

    }

    public static void main(String[] args) {
        Server server = new Server(8085);
        server.bindSocket();
    }

    public void bindSocket() {
        try (ServerSocket serverSocket = new ServerSocket(8085)) {
            System.out.println("Server is listening...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                Client client = new Client(clientSocket, clients, "Igor"); // Pass clients list
                clients.add(client);
                fixedPool.submit(client);
                System.out.println("Cliente conectado");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
