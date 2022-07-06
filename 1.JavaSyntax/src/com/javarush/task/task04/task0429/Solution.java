package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int a = 0;
        int b = 0;

        if (num1 > 0) {
            a++;
        }
        if (num1 < 0) {
            b++;
        }
        if (num2 > 0) {
            a++;
        }
        if (num2 < 0)
        {
            b++;
        }
        if (num3 > 0) {
            a ++;
        }
        if (num3 < 0)
        {
            b++;
        }


        System.out.println("количество отрицательных чисел: " + b);
        System.out.println("количество положительных чисел: " + a);

    }
}
