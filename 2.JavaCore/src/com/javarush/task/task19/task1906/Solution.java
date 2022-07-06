package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fn_1 = reader.readLine();
        String fn_2 = reader.readLine();
        reader.close();
        FileReader fr = new FileReader(fn_1);
        FileWriter fw = new FileWriter(fn_2);
        int count = 1;
        while (fr.ready()) {
            int i = fr.read();
            if (count %2 == 0) {
                fw.write(i);
            }
            count++;
        }
        fr.close();
        fw.close();
    }
}
