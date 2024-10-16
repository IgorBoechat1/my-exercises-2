package io.bootcamp.fanstatics;

import java.io.*;

public class CopyFile {
    private String filename;



    public static void copy(String input, String output) throws IOException {


        FileInputStream fileInputStream = new FileInputStream(input);
        FileOutputStream fileOutputStream = new FileOutputStream(output);

        int readedBytes;
        byte[] buffer = new byte[1024];

        while((readedBytes = fileInputStream.read(buffer)) != -1){
          //  fileOutputStream.write(buffer, 0, readedBytes);
            fileOutputStream.write(buffer);

        }


    }


    }



