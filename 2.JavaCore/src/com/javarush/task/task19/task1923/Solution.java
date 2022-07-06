package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            for (String s : line) {
                if (s.matches(".+[0-9].*")) {
                    writer.write(s + " ");
                }
            }
        }
        reader.close();
        writer.close();
    }
}
