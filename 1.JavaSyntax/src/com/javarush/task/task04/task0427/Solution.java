package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(buffer.readLine());
        String str1;

        if (chet(x)) str1 = "четное";
        else str1 = "нечетное";

        if (x != 0 && razmer(x) != null) System.out.println(str1 + " " + razmer(x));
    }

    public static boolean chet(int x){
        if (x % 2 == 0) return true;
        else return false;
    }

    public static String razmer(int x){
        if (x > 0 && x < 1000){
            if (x/100 != 0) return "трехзначное число";
            else if (x/10 != 0) return "двузначное число";
            else return "однозначное число";
        }
        else return null;
    }

}
