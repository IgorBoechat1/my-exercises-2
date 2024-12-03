package io.codeforall.fanstatics;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        MyPojo myPojo2 = mapper.readValue(new URL("https://ipinfo.io/json"), MyPojo.class);
        String jsonString = mapper.writeValueAsString(myPojo2);
        System.out.println(jsonString);

    }
}
