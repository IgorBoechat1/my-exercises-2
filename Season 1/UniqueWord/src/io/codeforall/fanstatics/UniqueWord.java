package io.codeforall.fanstatics;


import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class UniqueWord implements Iterable<String> {

    private TreeSet<String> set;

    @Override
    public Iterator iterator() {
        return set.iterator();
    }

    public UniqueWord(String str) {
    this.set = new TreeSet<>(List.of(str.split(" ")));



    }
}
