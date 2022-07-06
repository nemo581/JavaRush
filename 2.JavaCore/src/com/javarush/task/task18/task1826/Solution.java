package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;
        switch (args[0]) {
            case "-e":
                encryption(args[1], args[2]);
                break;
            case "-d":
                decryption(args[1], args[2]);
                break;
        }
    }

    public static void encryption(String fileReaderName, String fileWriterName) throws IOException {
        FileInputStream fileReader = new FileInputStream(fileReaderName);
        FileOutputStream fileWriter = new FileOutputStream(fileWriterName);
        while (fileReader.available() > 0) {
            fileWriter.write(fileReader.read() + 1);
        }
        fileReader.close();
        fileWriter.close();
    }
    public static void decryption(String fileReaderName, String fileWriterName) throws IOException {
        FileInputStream fileReader = new FileInputStream(fileReaderName);
        FileOutputStream fileWriter = new FileOutputStream(fileWriterName);
        while (fileReader.available() > 0) {
            fileWriter.write(fileReader.read() - 1);
        }
        fileReader.close();
        fileWriter.close();
    }
}
