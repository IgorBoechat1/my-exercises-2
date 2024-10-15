package io.codeforall.fanstatics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


public class WordHistogram implements Iterable<String> {


    private HashMap<String, Integer> hashMap;
    private String[] wordsArray;


    public WordHistogram(String string) {
        this.hashMap = new HashMap<>();

        wordsArray = string.split(" ");

        for (String word : wordsArray) {

            if (hashMap.containsKey(word)) {
                hashMap.replace(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }

    }



    public int size() {
        return hashMap.keySet().size();
    }


    public int get(String word) {
        return hashMap.get(word);
    }

    @Override
    public Iterator<String> iterator() {
        return hashMap.keySet().iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }
}





