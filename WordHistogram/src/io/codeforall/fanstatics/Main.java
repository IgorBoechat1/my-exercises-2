package io.codeforall.fanstatics;

public class Main {

    public static final String STRING = "test word word test wewe wewe mais word";

    public static void main(String[] args) {
        WordHistogram wordHistogram = new WordHistogram(STRING);
        System.out.println("Map has " + wordHistogram.size() + " distinct words");


        for (String word : wordHistogram) {
            System.out.println(word + ": " + wordHistogram.get(word));

        }


    }

}
