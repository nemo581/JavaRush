package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] myArray = initializeArray();

        int max = max(myArray);
        System.out.println(max);
        //System.out.println("This Length: " + array.length); // myString
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] result = new int[20];
        for (int i = 0; i < result.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            result[i] = num;
        }


        return result;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
