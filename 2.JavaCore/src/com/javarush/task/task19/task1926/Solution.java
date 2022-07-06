package com.javarush.task.task19.task1926;

import java.io.*;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        StringBuilder revers = new StringBuilder();
        while (file.ready()) {
            String line = file.readLine();
            System.out.println(new StringBuffer(line).reverse().toString());
        }
        file.close();

    }
}
