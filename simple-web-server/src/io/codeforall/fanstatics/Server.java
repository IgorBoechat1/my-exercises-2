package io.codeforall.fanstatics;

import java.io.*;
import java.net.*;

public class Server {

    public static FileInputStream inputStream;
    public static FileOutputStream outputStream;
    public final static byte[] bytes = new byte[5000];
    public static int bytesRead;

public boolean fileNotfound(){
    if (inputStream != null);
    return false;

}
    public static void main(String[] args) throws IOException {

        int port = 8080;
        BufferedInputStream reader = null;
        ServerSocket serverSocket = new ServerSocket(port);



        // Prepare to read and write requests from/to the client
        Socket clientSocket = serverSocket.accept();
        System.out.println("connection estabilished");

        // Create IO's files
        while (true) {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String messageFromClient = in.readLine().substring(5);
            OutputStream outputStream = clientSocket.getOutputStream();
            
            
         
            
            
            switch (messageFromClient) {
                case "logo.png HTTP/1.1":

                    inputStream = new FileInputStream("www/favicon.ico");

                    bytesRead = inputStream.read(bytes);
                    
                    System.out.println(bytesRead);
                    out.println("HTTP/1.1 200 Document Follows\r\n Content-Type: image/png \r\n Content-Length:" + bytesRead + "\r\n \r\n");

                    outputStream.write(bytes, 0, bytesRead);

                    outputStream.flush();
                    break;


                case "404.html HTTP/1.1":
                    FileInputStream inputStream = new FileInputStream("404.html");

                    bytesRead = inputStream.read(bytes);

                    System.out.println(bytesRead);
                    out.println("HTTP/1.0 404 Not Found\r\n Content-Type: text/html; charset=UTF-8 \r\n Content-Length: <file_byte_size> \r\n \r\n");

                    outputStream.write(bytes, 0, bytesRead);

                    outputStream.flush();
                    out.println("HTTP/1.0 404 Not Found\\r\\n Content-Type: text/html; charset=UTF-8 \\r\\n Content-Length: <file_byte_size> \\r\\n \\r\\n\"");
                    break;

                case "index.html HTTP/1.1":
                    out.println("HTTP/1.0 200 Document Follows \r\n Content-Type: text/html; charset=UTF-8 \r\n Content-Length: <file_byte_size> A root index page \r\n \r\n");
                    break;


            }

        }


    }
}






