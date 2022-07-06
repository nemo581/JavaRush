package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file_1 = new FileInputStream(reader.readLine());
        FileOutputStream file_2 = new FileOutputStream(reader.readLine());
        FileOutputStream file_3 = new FileOutputStream(reader.readLine());
        reader.close();
        if (file_1.available() > 0) {
            byte[] buf = new byte[file_1.available()];
            int count = file_1.read(buf);
            if (buf.length % 2 == 0) {
                file_3.write(buf, buf.length / 2, buf.length / 2);
                System.out.println(buf.length + " " + count);
                file_2.write(buf, 0, buf.length / 2);
            } else {
                file_3.write(buf, buf.length / 2 + 1, buf.length / 2);
                System.out.println(buf.length + " " + count);
                file_2.write(buf, 0, buf.length / 2 + 1);
            }
        }
        file_1.close();
        file_2.close();
        file_3.close();
    }
}
