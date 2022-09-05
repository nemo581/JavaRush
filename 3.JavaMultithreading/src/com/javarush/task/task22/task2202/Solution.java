package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java"));

//        T-E-S-T
//        String s = null;
//        for (int j = 0; j < 10; j++) {
//            long startTime = System.currentTimeMillis();
//            for (int i = 0; i < 1000000; i++) {
//                System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java"));
//                s = getPartOfString("JavaRush - лучший сервис обучения Java");
//            }
//            System.out.println(System.currentTimeMillis() - startTime);
//        }
    }

    public static String getPartOfString(String string) {
//        MuSolution
        int index = -1;
        if (string == null || !string.contains(" ")) {
            throw new TooShortStringException();
        } else {
            for (int i = 0; i < 4; i++) {
                index = string.indexOf(" ", index + 1);
                if (index == -1) {
                    throw new TooShortStringException();
                }
            }
            if (string.indexOf(" ", index + 1) != -1) {
                return string.substring(string.indexOf(" ") + 1, string.indexOf(" ", index + 1));
            } else {
                return string.substring(string.indexOf(" ") + 1);
            }
        }

//        TheirSolution
//        if (string == null) {
//            throw new TooShortStringException();
//        }
//        String[] splitWithSpaces = string.split(" ");
//
//        if (splitWithSpaces.length < 5) throw new TooShortStringException();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 1; i < 5; i++) {
//            stringBuilder.append(splitWithSpaces[i]);
//            stringBuilder.append(" ");
//        }
//        return stringBuilder.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
