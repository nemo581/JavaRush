package com.javarush.task.task18.task1820;
/*
Округление чисел
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_1 = reader.readLine();
        String file_2 = reader.readLine();
        String temp;
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(file_1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file_2));
        while (fileReader.ready()) {
            temp = fileReader.readLine();
            for (String part : temp.split("\\s")) {
                int ex = (int) Math.round(Double.parseDouble(part));
                fileWriter.write(ex + " ");
            }
        }
        fileWriter.close();
        fileReader.close();
    }
}
