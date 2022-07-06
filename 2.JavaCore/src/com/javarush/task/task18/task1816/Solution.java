package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;
        FileInputStream fileInput = new FileInputStream(args[0]);
        int count = 0;
        while (fileInput.available() > 0) {
            int tst = fileInput.read();
            if (tst >= 65 && tst <= 90 || tst >= 97 && tst <= 122) {
                count++;
            }
        }
        fileInput.close();
        System.out.println(count);
    }
}
