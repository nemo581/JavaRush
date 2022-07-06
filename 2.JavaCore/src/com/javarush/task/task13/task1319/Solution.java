package com.javarush.task.task13.task1319;


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writter = new BufferedWriter(new FileWriter(reader.readLine()));
        String line;
        while (true) {
            line = reader.readLine();
            writter.write(line);
            writter.newLine();
            if (line.equals("exit")) {
                break;
            }
        }

        reader.close();
        writter.close();


    }
}

// C:\Users\AlRezn\Desktop\2.txt
