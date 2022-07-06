package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String put = reader.readLine();
        Map<String, Integer> mounth = new HashMap<>();
        mounth.put("January", 1);
        mounth.put("February", 2);
        mounth.put("March", 3);
        mounth.put("April", 4);
        mounth.put("May", 5);
        mounth.put("June", 6);
        mounth.put("July", 7);
        mounth.put("August", 8);
        mounth.put("September", 9);
        mounth.put("October", 10);
        mounth.put("November", 11);
        mounth.put("December", 12);

        for (HashMap.Entry<String, Integer> text : mounth.entrySet()) {
            if (put.equalsIgnoreCase(text.getKey())) {
                System.out.println(text.getKey() + " is the " + text.getValue() + " month");
            }
        }


    }
}
