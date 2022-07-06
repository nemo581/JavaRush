package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(convertToSeconds(a));
        System.out.println(convertToSeconds(b));
    }

    public static int convertToSeconds(int hour) {
        int sec = hour * 3600;
        return sec;
    }
}
