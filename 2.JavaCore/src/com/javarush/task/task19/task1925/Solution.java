package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            String[] line = reader.readLine().split("\\s");
            for (String s : line) {
                if (s.trim().length() > 6) {
                    sb.append(s.trim()).append(",");
                }
            }
        }
        reader.close();
        writer.write(String.valueOf(sb.replace((sb.length() - 1), sb.length(), "")));
        writer.close();
    }
}
