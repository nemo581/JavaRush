package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arNum = new int[10];

        for (int i = 0; i < arNum.length; i++){
            int num = Integer.parseInt(reader.readLine());
            arNum[i] = num;
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(arNum[i]);
        }

    }
}

