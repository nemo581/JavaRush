package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String link = reader.readLine();
        reader.close();
        ArrayList<String> valuePar = new ArrayList<>();

        if(link.contains("?")) {
            String[] linkFilter = link.split("\\?");
            String linkF = linkFilter[1];

            if(linkF.contains("&")) {
                String[] paramFilter = linkF.split("&");
                for (String s : paramFilter) {
                    if (s.contains("obj")) {
                        valuePar.add(s.substring(s.lastIndexOf("=") + 1));

                        String[] paramA = s.split("=");
                        System.out.print(paramA[0] + " ");
                    } else {
                        String[] paramB = s.split("=");
                        System.out.print(paramB[0] + " ");
                    }
                }
                System.out.println();
            }

            if(valuePar.size() > 0) {
                for (String s : valuePar) {
                    try {
                        double value = Double.parseDouble(s);
                        alert(value);
                    } catch (NumberFormatException e) {
                        alert(s);
                    }
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
