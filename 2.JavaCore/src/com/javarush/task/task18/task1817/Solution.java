package com.javarush.task.task18.task1817;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
/* 
Пробелы
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        float count32 = 0;
        float count = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                count++;
                if (line.charAt(i) == ' ') {
                    count32++;
                }
            }
        }
        reader.close();
        float result = count32/count*100;
//        System.out.println(result);
        System.out.printf("%.2f", result);
//        System.out.printf("%.2f", Math.floor(100.0 * result) * 0.01);
    }
}
