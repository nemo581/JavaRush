package com.javarush.task.task18.task1821;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
/* 
Встречаемость символов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        TreeMap<Character, Integer> map = new TreeMap<>();
        char key;
        int count = 1;
        FileInputStream fileInput = new FileInputStream(fileName);
        while (fileInput.available() > 0) {
            key = (char) fileInput.read();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, count);
            }
        }
        fileInput.close();

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " +  pair.getValue());
        }
    }
}
