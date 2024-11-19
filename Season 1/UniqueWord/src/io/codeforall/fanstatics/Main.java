package io.codeforall.fanstatics;

public class Main {

    public static final String STRING = "rui rui rui campelo campelo campelo test test abc abc";

    public static void main(String[] args) {
        UniqueWord wo = new UniqueWord(STRING);


        for (String word : wo) {
            System.out.println(word);
        }
    }
}
