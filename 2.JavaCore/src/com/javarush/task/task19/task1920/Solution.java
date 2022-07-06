package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        double maxValue = 0;
        while (fileReader.ready()) {
            String[] fileLine = fileReader.readLine().split("\\s");
            String key = fileLine[0].trim();
            Double value = Double.parseDouble(fileLine[1].trim());
            map.merge(key, value, Double::sum);
            if (value >= maxValue) {
                maxValue = value;
            }
        }
        fileReader.close();

        double maxValueInMap = (Collections.max(map.values()));
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (maxValueInMap == entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }
    }
}
