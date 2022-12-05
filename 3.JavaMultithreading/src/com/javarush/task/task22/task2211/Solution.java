package com.javarush.task.task22.task2211;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File file_1 = new File(args[0]);
        File file_2 = new File(args[1]);
        try (FileInputStream fileInputStream = new FileInputStream(file_1)) {
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            String s = new String(buffer, "Windows-1251");
            buffer = s.getBytes(StandardCharsets.UTF_8);
            try (FileOutputStream fileOutputStream = new FileOutputStream(file_2)) {
                fileOutputStream.write(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}