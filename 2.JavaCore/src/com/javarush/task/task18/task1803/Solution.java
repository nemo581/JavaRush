package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        byte[] array = new byte[255];
        while (fileInputStream.available() > 0) {
            array[fileInputStream.read()]++;
        }
        fileInputStream.close();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 2) {
                System.out.print(i +  " ");
            }
        }
    }
}
