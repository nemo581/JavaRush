package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }
    public static int min(int a, int b) {
        int result = a < b ? a : b;

        return result;
    }
    public static long min(long a, long b) {
        long result = a < b ? a : b;
        return result;
    }
    public static double min(double a, double b) {
        double result = a < b ? a: b;
        return result;
    }
}
