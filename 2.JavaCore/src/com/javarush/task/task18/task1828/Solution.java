package com.javarush.task.task18.task1828;

import java.io.*;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;
        BufferedReader reader;
        int id;
        String fileName;
        try {
            id = Integer.parseInt(args[1]);
        } catch (NumberFormatException n) {
            return;
        }
        switch (args[0]) {
            case "-u":
                if (args.length == 5) {
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    fileName = reader.readLine();
                    reader.close();
                    updateInfo(fileName, id, args[2], args[3], args[4]);
                } else {
                    return;
                }
                break;
            case "-d":
                if (args.length == 2) {
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    fileName = reader.readLine();
                    reader.close();
                    deleteInfo(fileName, id);
                } else {
                    return;
                }
                break;
            default: break;
        }
    }

    public static void updateInfo(String fileName, int id, String productName, String price, String quantity) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = fileReader.readLine()) != null) {
            char[] dst = new char[8];
            line.getChars(0, 8, dst, 0);
            if (id == Integer.parseInt(String.valueOf(dst).trim())) {
                String temp = String.format("\n%-8d%-30.30s%-8.8s%-4.4s", id, productName, price, quantity);
                stringBuilder.append(temp);
            } else {
                stringBuilder.append("\n").append(line);
            }
        }
        fileReader.close();
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
        fileWriter.write(stringBuilder.toString().trim());
        fileWriter.close();
    }

    public static void deleteInfo(String fileName, int id) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = fileReader.readLine()) != null) {
            char[] dst = new char[8];
            line.getChars(0, 8, dst, 0);
            if (id == Integer.parseInt(String.valueOf(dst).trim())) {
                stringBuilder.append("");
            } else {
                stringBuilder.append("\n").append(line);
            }
        }
        fileReader.close();
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
        fileWriter.write(stringBuilder.toString().trim());
        fileWriter.close();
    }
}
