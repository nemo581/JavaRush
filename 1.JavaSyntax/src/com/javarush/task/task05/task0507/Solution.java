package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(simpleAverage());
    }

    public static double simpleAverage() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        double sum = 0.0;
        while (true) {
            i++;
            int num = Integer.parseInt(reader.readLine());
            sum = sum + num;
            if (num == -1) {
                i--;
                sum++;
                break;
            }
        }
        return sum / i;
    }
}

