package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (fileReader.ready()) {
            String file = fileReader.readLine();
            String[] line = file.split("\\s");
            int count = 0;
            for (String l : line) {
                for (String w : words) {
                    if (l.equals(w)) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.println(file);
            }
        }
        fileReader.close();
    }
}
