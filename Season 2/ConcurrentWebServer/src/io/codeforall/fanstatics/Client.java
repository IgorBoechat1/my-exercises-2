/* package io.codeforall.fanstatics;

import static com.sun.tools.attach.VirtualMachine.list;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.in;
import java.net.Socket;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;


public class Client implements Runnable {

    private Socket socket;


    public Client(Socket socket, list) throws IOException {
        this.socket = socket;

    }
    @Override
    public void run() {
            
            String inputLine;
            try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            }
            while (true) {
                String message = in.readLine();

                for(Client client : list){
                    if (client != this) {
                        client.out.println(message);
                    }
                  if (!((inputLine = in.readLine()) != null)) 
                
                  throw new RuntimeException(e);
                }
                System.out.println("Message received from client: " + inputLine);
                  catch (IOException ex) {
        }
        }
        
        
    }
}
}    
 */
package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList; // Assuming you want an ArrayList to hold Client objects

public class Client implements Runnable {

    private Socket socket;
    private ArrayList<Client> clients; // List of other Client objects for communication
    private PrintWriter out;
    private String name;

    public Client(Socket socket, ArrayList<Client> clients, String name) throws IOException {
        this.socket = socket;
        this.clients = clients;
        this.name = setName(getName());

    }

    @Override
    public synchronized void run() {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            while (true) {
                String message = in.readLine();
                System.out.println("message from; "+ message);

                // Broadcast message to other clients
                for (Client client : clients) {
                    if (client != this) {
                        client.out.println("Message received from client: " + message);
                    }

                }

            }
        } catch (IOException ex) {
            System.err.println("Error while reading from client: " + ex.getMessage());
            // Handle the exception here (e.g., close resources, exit loop)
        }
    }

    public String getName() {
        return name;
    }

    private String setName(String name) {
        return name;

    }

}
