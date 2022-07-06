package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> lastNameName = new HashMap<String, String>();
        lastNameName.put("Иванов", "Иван");
        lastNameName.put("Иванова", "Антонина");
        lastNameName.put("Антонова", "Феодосия");
        lastNameName.put("Антонов", "Алексей");
        lastNameName.put("Романова", "Анастасия");
        lastNameName.put("Петрова", "Людмила");
        lastNameName.put("Жданов", "Антонио");
        lastNameName.put("Нежданов", "Петя");
        lastNameName.put("Васякин", "Руслан");
        lastNameName.put("Русланов", "Вася");
        return lastNameName;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(), "Вася"));

    }
}
