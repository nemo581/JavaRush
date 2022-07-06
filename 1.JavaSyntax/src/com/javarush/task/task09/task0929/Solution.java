package com.javarush.task.task09.task0929;

/* 
Обогатим код функциональностью!
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = null;
        String destinationFileName = null;
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;


        try {
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл 1 не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }
//        finally {
//            System.out.println("Файл 1 не существует. Программа остановлена");
//        }

        try {
            destinationFileName = reader.readLine();
            fileOutputStream = getOutputStream(destinationFileName);
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл 2 не существует.");
            destinationFileName = reader.readLine();
            fileOutputStream = getOutputStream(destinationFileName);
        }
//        finally {
//            System.out.println("Файл 2 не существует. Программа остановлена");
//        }

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

