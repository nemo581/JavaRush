package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Stallone", 600);
        map.put("Hitchcock", 200);
        map.put("Spilberg", 550);
        map.put("Douglas", 300);
        map.put("Van Damm", 200);
        map.put("Twain", 201);
        map.put("Shelby", 800);
        map.put("Machiavelli", 50);
        map.put("Tesla", 350);
        map.put("Freud", 500);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            int value = pair.getValue();
            if (value < 500) {
                iterator.remove();
            }
        }
//        System.out.println(map);
    }

    public static void main(String[] args) {
//        removeItemFromMap(createMap());

    }
}