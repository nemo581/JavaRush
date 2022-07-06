package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            line = line.replace(".", "!");
            fileWriter.write(line);
        }
        fileReader.close();
        fileWriter.close();
    }
}
