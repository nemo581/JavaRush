package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> people = new HashMap<>();
        people.put("A", "B");
        people.put("C", "D");
        people.put("A", "E");
        people.put("F", "B");
        people.put("A", "I");
        people.put("G", "K");
        people.put("L", "M");
        people.put("N", "O");
        people.put("P", "Q");
        people.put("R", "B");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
