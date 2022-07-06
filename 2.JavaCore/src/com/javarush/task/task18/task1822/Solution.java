package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        int searchID = Integer.parseInt(args[0]);

        BufferedReader fileReader = new BufferedReader(new FileReader(name));
        String line;
        while (fileReader.ready()) {
            line = fileReader.readLine();
            int id;
            for (String part : line.split("\\s")) {
                try {
                    id = Integer.parseInt(part);
                    if (id == searchID) {
                        System.out.println(line);
                    }
                } catch (NumberFormatException nfe) {
                    break;
                }
            }
        }
        fileReader.close();
    }
}
