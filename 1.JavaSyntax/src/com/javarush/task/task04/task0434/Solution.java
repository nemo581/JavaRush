package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        while (a < 10) {
            while (b < 10) {
                System.out.print((a + 1) * (b + 1) + " ");
                b++;
            }
            System.out.println();
            a++;
            b = 0;

        }

    }
}
