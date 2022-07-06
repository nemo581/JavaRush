package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        String a = "зима";
        String b = "весна";
        String c = "лето";
        String d = "осень";

        if (month == 12 | month <= 2) {
            System.out.println(a);
        }

        if (month >= 3 && month <= 5) {
            System.out.println(b);
        }

        if (month >= 6 && month <= 8) {
            System.out.println(c);
        }

        if (month >= 9 && month <= 11) {
            System.out.println(d);
        }

    }
}