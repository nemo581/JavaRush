package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] rev = new String[10];

        for (int i = 0; i < 8; i++) {
            String num = reader.readLine();
            rev[i] = num;
        }


        for(int i = 9; i >= 0; i--) {
            System.out.println(rev[i]);
        }

    }
}