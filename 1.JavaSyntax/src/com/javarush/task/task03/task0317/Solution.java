package com.javarush.task.task03.task0317;

/* 
Путь самурая
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("Вариант 1. Копирование символов: " + "日本語");

        char a = '\u65e5';
        char b = '\u672c';
        char c = '\u8a9e';
        System.out.println("Вариант 2. Присваивание значений переменным: " + a + "" + b + "" + c);
        System.out.print("Вариант 3. Запись UNICOD в одну строку: " + "\u65e5\u672c\u8a9e");

    }
}
