package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numX = new int[5];
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(reader.readLine());
            numX[i] = num;
        }
        Arrays.sort(numX);
        for (int i = 0; i < numX.length; i++) {
            System.out.print(numX[i] + " ");
        }

    }
}
