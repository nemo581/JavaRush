package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int day = Integer.parseInt(name);

        String a = "понедельник";
        String b = "вторник";
        String c = "среда";
        String d = "четверг";
        String e = "пятница";
        String f = "суббота";
        String g = "воскресенье";

        if (day == 1) {
            System.out.println(a);
        }

        if (day == 2) {
            System.out.println(b);
        }

        if (day == 3) {
            System.out.println(c);
        }

        if (day == 4) {
            System.out.println(d);
        }

        if (day == 5) {
            System.out.println(e);
        }

        if (day == 6) {
            System.out.println(f);
        }

        if (day == 7) {
            System.out.println(g);
        }

        if (day < 1 | day > 7) {
            System.out.println("такого дня недели не существует");
        }

    }
}