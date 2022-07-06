package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int number = Integer.parseInt(name);

        if (number > 0) {
            System.out.println(number * 2);
        }

        if (number < 0) {
            System.out.println(number + 1);
        }

        if (number == 0) {
            System.out.println(number);
        }


    }

}