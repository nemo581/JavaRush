package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strYear = reader.readLine();
        int year = Integer.parseInt(strYear);

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("количество дней в году: 366");
        }
        else {
            System.out.println("количество дней в году: 365");
        }

    }
}