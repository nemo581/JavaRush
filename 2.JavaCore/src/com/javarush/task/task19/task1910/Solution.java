package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        while (fileReader.ready()) {
            fileWriter.write(fileReader.readLine().replaceAll("[\\p{P}]", ""));
        }
        fileWriter.close();
        fileReader.close();

    }
}
