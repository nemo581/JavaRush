package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                int key = Integer.parseInt(matcher.group().trim());
                if (map.containsKey(key)) {
                    line = line.replaceAll("\\b" + matcher.group() + "\\b", map.get(key));
                }
            }
            sb.append(line).append("\n");
        }
        fileReader.close();
        System.out.println(sb.toString().trim());
    }
}
