package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

//        String line;
//        while (fileReader.ready()) {
//            line = fileReader.readLine();
//            String[] sort = line.split("\\s");
//            for (String x : sort) {
//                try {
//                    int n = Integer.parseInt(x.trim());
//                    fileWriter.write(n + " ");
//                } catch (NumberFormatException nfe) {
//                }
//            }
//        }


        Pattern pattern = Pattern.compile("\\b[0-9]+\\b");
        while (fileReader.ready()) {
            Matcher matcher = pattern.matcher(fileReader.readLine());
            while (matcher.find()) {
                fileWriter.write(matcher.group().trim() + " ");
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
