package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int maxNam1;
        if (a > b) {
            maxNam1 = a;
        }
        else {
            maxNam1 = b;
        }

        int maxNam2;
        if (c > d) {
            maxNam2 = c;
        }
        else {
            maxNam2 = d;
        }

        if (maxNam1 > maxNam2) {
            System.out.println(maxNam1);
        }
        else {
            System.out.println(maxNam2);
        }

    }
}
