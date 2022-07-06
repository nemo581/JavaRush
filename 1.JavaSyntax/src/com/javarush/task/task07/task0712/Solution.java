package com.javarush.task.task07.task0712;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 
Самые-самые
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int max = strings.get(0).length();
        int min = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() < min) {
                min = strings.get(i).length();
            }
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == min) {
                System.out.println(strings.get(i));
                break;
            }
            if (strings.get(i).length() == max) {
                System.out.println(strings.get(i));
                break;
            }

        }
    }
}
