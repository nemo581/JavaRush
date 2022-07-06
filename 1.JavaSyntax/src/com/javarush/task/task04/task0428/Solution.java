package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int i = 0;

        if (num1 >= 1) {
            i++;
        }
        if (num2 >= 1) {
            i++;
        }
        if (num3 >= 1) {
            i ++;
        }

            System.out.println(i);


    }
}
