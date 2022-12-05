package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        System.out.println(stringTokenizer.countTokens());
        String[] result = new String[stringTokenizer.countTokens()];
        int count = 0;
        while (stringTokenizer.hasMoreTokens()) {
            result[count] = stringTokenizer.nextToken();
            count++;
        }
        return result;
    }
}
