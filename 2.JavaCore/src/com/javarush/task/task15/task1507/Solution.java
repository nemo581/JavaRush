package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

import javax.management.StringValueExp;
import java.awt.*;

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(short m, int n, String value) {
        System.out.println("Method 3");
    }
    public static void printMatrix(long m, short n, String value) {
        System.out.println("Method 4");
    }
    public static void printMatrix(int m, short n, String value) {
        System.out.println("Method 5");
    }
    public static void printMatrix(int m, long n, String value) {
        System.out.println("Method 6");
    }
    public static void printMatrix(short m, long n, String value) {
        System.out.println("Method 7");
    }
    public static void printMatrix(short m, short n, String value) {
        System.out.println("Method 8");
    }
    public static void printMatrix(long m, long n, String value) {
        System.out.println("Method 9");
    }
    public static void printMatrix(double m, int n, String value) {
        System.out.println("Method 10");
    }
}
