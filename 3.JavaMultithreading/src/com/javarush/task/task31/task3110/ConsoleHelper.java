package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    public static void writeMessage(String message) {
        System.out.println(message);
    }
    public static String readString() throws IOException {
        String readString;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            readString = reader.readLine();
        }
        return readString;
    }

    public static int readInt() throws IOException {
        int readInt;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            readInt = Integer.parseInt(reader.readLine());
        }
        return readInt;
    }
}
