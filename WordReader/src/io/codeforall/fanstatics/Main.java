package io.codeforall.fanstatics;

import java.io.IOException;
import java.util.Iterator;

public class Main {
    private static final String FILE_PATH = "/Users/codecadet/Documents/my-exercises1/WordReader/rsc/testFile.txt";


    public static void main(String[] args) throws IOException {


        WordReader wordReader = new WordReader(FILE_PATH);

        for (String word : wordReader)
            System.out.println(word);


        //Iterator<String> iterator = wordReader.iterator();
        //while (iterator.hasNext()) {
          //  System.out.println(iterator.next());
        //}
    }
}





