package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class WordReader implements Iterable<String> {


    int i = 0;
    String[] words;


    public WordReader(String file) throws IOException {
        BufferedReader bReader = null;
        try {

            // create a new file reader
            FileReader reader = new FileReader(file);
            // wrap the file reader using a buffered reader
            bReader = new BufferedReader(reader);
        } catch (IOException ex) {
            System.out.println("error");
        }


        String line = "";
        String result = "";

        // using the buffered reader we can read lines
        while ((line = bReader.readLine()) != null) {
            line = line.replaceAll("[^a-zA-Z ]", "");
            result += line;

        }
        bReader.close();
        this.words = result.split(" ");

    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {


            @Override
            public boolean hasNext() {
                return words.length > i;
            }

            @Override
            public String next() {

                return words[i++];
            }
        };


    }
}



