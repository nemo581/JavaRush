package com.javarush.task.task14.task1419;

import java.io.*;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        try {
            int[] i = new int[10];
            i[15] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
          exceptions.add(e);
        }

        try {
            String s = "1.5";
            int b = Integer.parseInt(s);
            System.out.println(b);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            FileReader fileX = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
//            throw new IndexOutOfBoundsException();

//            int[] x = new int[10];
//            int i = 0;
//            while (i < x.length) {
//                x[i] = i;
//                i++;
//            }
//            for (int j = 0; j < 12; j++) {
//                int b = x[j];
//            }
            String a = "Лапа";
            char b = a.charAt(10);

        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }

        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            exceptions.add(e);
        }

        try {
            throw new SocketException();
        } catch (SocketException e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }

        try {
            throw new Exception();
        } catch (Exception e) {
            exceptions.add(e);
        }


        //напишите тут ваш код

    }
}
