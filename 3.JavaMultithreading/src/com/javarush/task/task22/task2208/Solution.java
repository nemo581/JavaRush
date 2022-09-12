package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> test = new LinkedHashMap<>();
        test.put("name", "Ivanov");
        test.put("country", "Russia");
        test.put("city", "Tula");
        test.put("age", null);
        System.out.println(getQuery(test));

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder WHERE = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (entry.getValue() != null) {
                    WHERE.append(String.format("%s = '%s'", entry.getKey(), entry.getValue())).append(" and ");
                }
            }
            WHERE.delete((WHERE.length() - 5), WHERE.length());
        } catch (StringIndexOutOfBoundsException s) {
            return "";
        }
        return WHERE.toString();
    }
}
