package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        while (fileReader.ready()) {
            String[] line = fileReader.readLine().split("\\s");
            String name = line[0];
            Double price = Double.parseDouble(line[1]);
            if (map.containsKey(name)) {
                price = price + map.get(name);
                map.replace(name, price);
            } else {
                map.put(name, price);
            }
        }
        fileReader.close();

        for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
