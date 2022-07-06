package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a < 1 || b < 1) {
            throw new IllegalArgumentException();
        }
        int x;
        if (a > b) {
            x = b;
            while (x >= 0) {
                if (x <= 0) {
                    System.out.println("STOP");
                    break;
                }
                if (b % x == 0 && a % x == 0) {
                    System.out.println(x);
                    break;
                }
                x--;
            }
        } else {
            x = a;
            while (x >= 0) {
                if (x <= 0) {
                    System.out.println("STOP");
                    break;
                }
                if (a % x == 0 && b % x == 0) {
                    System.out.println(x);
                    break;
                }
                x--;
            }
        }
    }
}
