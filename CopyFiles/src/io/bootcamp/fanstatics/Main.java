package io.bootcamp.fanstatics;


import java.io.IOException;

public class Main{

    public static void main(String[] args) {

        try {
            CopyFile.copy("rsc/testFile.pdf", "rsc/testFile_copy.pdf");

        } catch (IOException e) {
        }


    }

}
