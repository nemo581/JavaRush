package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        String x = "именно";
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        for (int i = 0; i < strings.size() + 1; i++) {
            if (i % 2 != 0) {
                strings.add(i, x);
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
