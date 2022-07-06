package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strNum1 = reader.readLine();
        int num1 = Integer.parseInt(strNum1);

        String strNum2 = reader.readLine();
        int num2 = Integer.parseInt(strNum2);

        String strNum3 = reader.readLine();
        int num3 = Integer.parseInt(strNum3);

        if (num1 + num2 > num3 && num2 + num3 > num1 && num3 + num1 > num2) {
            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует.");
        }

    }
}