package com.javarush.task.task18.task1824;
import java.io.*;
/*
Файлы и исключения
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
        FileReader reader1;
        while (true) {
            file = reader.readLine();
            try {
                reader1 = new FileReader(file);
                reader1.close();
            } catch (FileNotFoundException f) {
                System.out.println(file);
                return;
            }
        }
    }
}
