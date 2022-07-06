package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }


        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i]) && (i + 1) != array.length) {
                int j = i + 1;
                for(int k = j; k < array.length; k++) {
                    if (isNumber(array[k])) {
                        String temp;
                        int x = Integer.parseInt(array[i]);
                        int y = Integer.parseInt(array[k]);
                        if (x < y) {
                            temp = array[i];
                            array[i] = array[k];
                            array[k] = temp;
                        }
                    }
                }
            }

            if (!(isNumber(array[i]))) {
                if (i + 1 != array.length) {
                    int j = i + 1;
                    for (int k = j; k < array.length; k++) {
                        if (!(isNumber(array[k]))) {
                            String a = array[i];
                            String b = array[k];
                            if (isGreaterThan(a, b)) {
                                String temp = array[i];
                                array[i] = array[k];
                                array[k] = temp;
                            }
                        }
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
