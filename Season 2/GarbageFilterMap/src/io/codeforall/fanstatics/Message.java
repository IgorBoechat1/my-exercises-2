package io.codeforall.fanstatics;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Message {

    public static void main(String[] args) {


        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";


        String result = Arrays.stream(message.split(" "))
                .filter(word -> !word.equals("garbage"))
                .map(String :: toUpperCase)
                .reduce("", (acc, word) -> acc + " "+ word);
//.reduce(0, (acc, elem) -> acc + elem);
        System.out.println(result);



    }
}
