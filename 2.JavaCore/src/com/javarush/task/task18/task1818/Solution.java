package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName_1 = reader.readLine();
        String fileName_2 = reader.readLine();
        String fileName_3 = reader.readLine();
        reader.close();

        FileReader fileReader = null;
        FileWriter fileWriter;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                fileReader = new FileReader(fileName_2);
            }
            if (i == 1) {
                fileReader = new FileReader(fileName_3);
            }
            fileWriter = new FileWriter(fileName_1, true);
            while (fileReader.ready()) {
                fileWriter.write(fileReader.read());
                fileWriter.flush();
            }
            fileReader.close();
            fileWriter.close();
        }
    }
}
