package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String[] buf = outputStream.toString().split(" ");
        System.setOut(consoleStream);
        if (buf[1].equals("+")) {
            int x = Integer.parseInt(buf[0]) + Integer.parseInt(buf[2]);
            String result = buf[0] + " " + buf[1] + " " + buf[2] + " " + buf[3] + " " + x;
            System.out.println(result);
        }
        if (buf[1].equals("-")) {
            int x = Integer.parseInt(buf[0]) - Integer.parseInt(buf[2]);
            String result = buf[0] + " " + buf[1] + " " + buf[2] + " " + buf[3] + " " + x;
            System.out.println(result);
        }
        if (buf[1].equals("*")) {
            int x = Integer.parseInt(buf[0]) * Integer.parseInt(buf[2]);
            String result = buf[0] + " " + buf[1] + " " + buf[2] + " " + buf[3] + " " + x;
            System.out.println(result);
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

