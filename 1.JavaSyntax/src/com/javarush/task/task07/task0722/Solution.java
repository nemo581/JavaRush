package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        boolean stop = false;
        while (!stop) {
            String forArray = reader.readLine();
            if (forArray.equals("end")) {
                stop = true;
            } else {
                strings.add(forArray);
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}