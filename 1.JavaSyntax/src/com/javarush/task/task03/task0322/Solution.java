package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
        String name1 = text.readLine();
        String name2 = text.readLine();
        String name3 = text.readLine();

        System.out.println(name1 + " +" + " " + name2 + " +" + " " + name3 + " " + "= Чистая любовь, да-да!");

        //напишите тут ваш код

    }
}