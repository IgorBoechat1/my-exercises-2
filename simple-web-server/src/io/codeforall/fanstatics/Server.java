package io.codeforall.fanstatics;

import java.io.*;
import java.net.*;

public class Server {

    public FileInputStream fileInputStream;
    public FileOutputStream fileOutputStream;


    public static void main(String[] args) throws IOException {

        int port = 8080;

        BufferedInputStream reader = null;

        ServerSocket serverSocket = new ServerSocket(port);


        // io.codeforall.fanstatics.Server connection
        Socket clientSocket = serverSocket.accept();
        System.out.println("connection estabilished");

        // Prepare to read and write requests from/to the client


        // Create IO's files

        while (true) {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String messageFromClient = in.readLine().substring(5);
            OutputStream outputStream = clientSocket.getOutputStream();

            switch (messageFromClient) {
                case "logo.png HTTP/1.1":
                    byte[] bytes = new byte[5000];
                    FileInputStream inputStream = new FileInputStream("www/favicon.ico");
                    int bytesread = inputStream.read(bytes);
                    System.out.println(bytesread);
                    out.println("HTTP/1.1 200 Document Follows\r\n Content-Type: image/png \r\n Content-Length:" + bytesread + "\r\n \r\n");
                    outputStream.write(bytes, 0, bytesread);
                    outputStream.flush();
                    break;

                case " HTTP/1.1":
                    out.println("HTTP/1.0 200 Document Follows\r\n Content-Type: text/html; charset=UTF-8\r\n Content-Length: <file_byte_size> \r\n \r\n");
                    break;

                case "404.html HTTP/1.1":
                    out.println("HTTP/1.0 404 Not Found Content-Type: text/html; charset=UTF-8\r\n Content-Length: <file_byte_size> \r\n \r\n");
                    break;
                case "index.html HTTP/1.1":
                    out.println("HTTP/1.0 200 Document Follows \r\n Content-Type: text/html; charset=UTF-8 \r\n Content-Length: <file_byte_size> A root index page \r\n \r\n");
                    break;


            }

        }


    }
}






