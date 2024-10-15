package io.codeforall.fanstatics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class WordHistogramInheritance extends HashMap<String, Integer> implements Iterable<String> {

    private String[] array;

    public WordHistogramInheritance(String string) {

        array = string.split(" ");

        for (String word : array) {

            if (containsKey(word)) {
                replace(word, get(word) + 1);
            } else {
                put(word, 1);
            }
        }
    }

    @Override
    public Iterator<String> iterator() {
        return keySet().iterator();
    }


}
