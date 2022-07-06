package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String entery = reader.readLine();
            if (entery.equals("exit")) {
                return;
            }
            if (entery.contains(".")) {
                try {
                    Double a = Double.parseDouble(entery);
                    print(a);
                    continue;
                } catch (NumberFormatException e) {
                    // NOP
                }
            }
            try {
                int b = Integer.parseInt(entery);
                if (b <= 0 || b >= 128) {
                    print(b);
                    continue;
                }
            } catch (NumberFormatException e) {
                // NOP
            }
            try {
                short c = Short.parseShort(entery);
                if (c >= 0 || c <= 128) {
                    print(c);
                    continue;
                }
            } catch ( NumberFormatException e) {
                // NOP
            }
            try {
                String d = entery;
                print(d);
            } catch (NumberFormatException e) {
                // NOP
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
