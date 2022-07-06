package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> live = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {break;}
            String family = reader.readLine();
            if (family.isEmpty()) {break;}
            live.put(city, family);
        }

        String city = reader.readLine();
        for (Map.Entry<String, String> text : live.entrySet()) {
            if (city.equalsIgnoreCase(text.getKey())) {
                System.out.println(text.getValue());
            }
        }

    }
}
