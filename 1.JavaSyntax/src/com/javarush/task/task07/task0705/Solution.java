package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numB = new int[20];
        int[] numSm1 = new int[10];
        int[] numSm2 = new int[10];

        for(int i = 0; i < numB.length; i++) {
           int num = Integer.parseInt(reader.readLine());
           numB[i] = num;
           if (i < 10) {
               numSm1[i] = numB[i];
           }
        }

        int j = 0;
        for (int i = 10; i < numB.length; i++) {
            numSm2[j] = numB[i];
            j++;
        }

        for (int i = 0; i < numSm2.length; i++) {
            System.out.println(numSm2[i]);
        }
    }
}
