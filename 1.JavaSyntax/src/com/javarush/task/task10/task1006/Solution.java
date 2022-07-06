package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        double d = (int) 2.50256e2d;
        char c = 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = (int)0.50f;
        double result = f + (i / c) - (d * s) - (int)500e-3;
        System.out.println("result: " + result);

    }
}