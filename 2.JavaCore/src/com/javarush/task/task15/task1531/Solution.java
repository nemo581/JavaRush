package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
/*
Факториал
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        String factori = null;
        if (n < 0) {
            factori = "0";
        } else if (n <= 150) {
            long start = System.nanoTime();
            BigInteger x = new BigInteger("1");
            for (int i = 1; i <= n; i++) {
                String temp = Integer.toString(i);
                BigInteger y  = new BigInteger(temp);
                x = y.multiply(x);
            }
            long finish = System.nanoTime();
            long elapsed = finish - start;
            factori = x.toString();
            System.out.println("прошло НС: " + elapsed);
            System.out.println("прошло МКС: " + (elapsed / 1000));
            System.out.println("прошло МС: " + (elapsed / 1000000));
            System.out.println("прошло СЕК: " + (elapsed / 1000000000));
        }
        return factori;
    }
}
