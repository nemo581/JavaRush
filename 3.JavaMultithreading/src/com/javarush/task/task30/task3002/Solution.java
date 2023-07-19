package com.javarush.task.task30.task3002;

/* 
Осваиваем методы класса Integer
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertToDecimalSystem("0x16")); //22
        System.out.println(convertToDecimalSystem("012"));  //10
        System.out.println(convertToDecimalSystem("0b10")); //2
        System.out.println(convertToDecimalSystem("62"));   //62
    }

    public static String convertToDecimalSystem(String s) {
        String result;
        if (s.startsWith("0x"))                               // Проверка на 16
            result = Integer.toString(Integer.parseInt(s.substring(2), 16));

        else if (s.startsWith("0b"))                       // Проверка на двоичную
            result = Integer.toString(Integer.parseInt(s.substring(2), 2));


        else if (s.startsWith("0") && s.matches("[01]+$"))       // Проверка на двоичную
            result = Integer.toString(Integer.parseInt(s.substring(0), 2));

        else if (s.startsWith("0"))                 //Проверка на 8
            result = Integer.toString(Integer.parseInt(s.substring(0), 8));

        else                           // Если все мимо - остается десятеричная
            result = Integer.toString(Integer.parseInt(s.substring(0), 10));
        return result;
    }
}
