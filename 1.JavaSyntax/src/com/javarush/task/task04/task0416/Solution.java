package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strTime = reader.readLine();
        double time = Double.parseDouble(strTime);

        double x = time % 5;

        if (x < 3) {
            System.out.println("зеленый");
        }

        if (x >= 3 && x < 4) {
            System.out.println("желтый");
        }

        if (x >= 4 && x < 5) {
            System.out.println("красный");
        }

    }
}