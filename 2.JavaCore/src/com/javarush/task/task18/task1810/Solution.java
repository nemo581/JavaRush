package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = null;
        FileInputStream inputStream = null;

        while (true) {
            reader = new BufferedReader(new InputStreamReader(System.in));
            inputStream = new FileInputStream(reader.readLine());
            if (inputStream.available() < 1000) {
                reader.close();
                inputStream.close();
                throw new DownloadException();
            }
            int control = 0;
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                control = control + data;
            }
        }
    }

    private static class DownloadException extends Exception {

    }
}
