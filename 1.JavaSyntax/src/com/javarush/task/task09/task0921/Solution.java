package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numList = new ArrayList<>();
        try {
            while (true) {
                numList.add(Integer.parseInt(reader.readLine()));
            }
        }
        catch (NumberFormatException| IOException e) {
            System.out.println(e.getMessage());
            for (int i = 0; i < numList.size(); i++) {
                System.out.print(numList.get(i) + " ");
            }
        }
    }
}
