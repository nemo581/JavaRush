package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    private static int count = 0;

    public static String getPartOfString(String string) throws TooShortStringException {
        int index;
        try {
            index = string.indexOf("\t");
        } catch (NullPointerException n) {
            throw new TooShortStringException();
        }

        if (index != -1) {
            count++;
            if (count == 2) {
                count = 0;
                return string.substring(0, index);
            }
            return getPartOfString(string.substring(index + 1));
        } else {
            count = 0;
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}