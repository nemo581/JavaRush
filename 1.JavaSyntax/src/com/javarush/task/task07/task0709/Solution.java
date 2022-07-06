package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(i, reader.readLine());
        }



        for (int i = 0; i < strings.size(); i++) {
            int count = 0;

            for (int j = 0; j < strings.size(); j++) {
                if (strings.get(i).length() <= strings.get(j).length()) {
                    count++;
                }

                if (count == 5) {
                    System.out.println(strings.get(i));
                }
            }
        }


// Var I
//        int min = strings.get(0).length();
//        for (int i = 0; i < strings.size(); i++) {
//            if (min > strings.get(i).length()) {
//                min = strings.get(i).length();
//            }
//            else {
//                min = min;
//            }
//        }
//
//        for (int i = 0; i < strings.size(); i++) {
//            if (strings.get(i).length() == min) {
//                System.out.println(strings.get(i));
//            }
//        }

    }
}
