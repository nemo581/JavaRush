package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for (int i = 5; i > 0; i--) {
            result = result + s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        System.out.println();
        String result = "";
        while (count > 0) {
            result = result + s;
            count--;
        }
        return result;
    }

    public static void main(String[] args) {
       System.out.println(multiply("Метод 1 "));
       System.out.println(multiply("Метод 2 ", 2));

    }
}
