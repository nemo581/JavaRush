package com.javarush.task.task18.task1809;

import java.io.*;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file_1 = new FileInputStream(reader.readLine());
        FileOutputStream file_2 = new FileOutputStream(reader.readLine());
        reader.close();
        if (file_1.available() > 0) {
            byte[] buf = new byte[file_1.available()];
            int charBuf = file_1.read(buf);
            for (int i = 0; i < buf.length; i++) {
                file_2.write(buf, buf.length - i - 1, 1);
            }
        }
        file_1.close();
        file_2.close();
    }
}
