package com.javarush.task.task08.task0817;

import java.text.ParseException;
import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Stallone", "Sylvester");
//        map.put("Machiavelli_2", "Nuccoloy");
        map.put("Hitchcock", "Alfred");
        map.put("Spilberg", "Stiven");
//        map.put("Spilberg_2", "Stiven");
        map.put("Douglas", "Micheal");
        map.put("Van Damm", "Jean-Claude");
        map.put("Twain", "Mark");
        map.put("Shelby", "Carroll Hall");
        map.put("Machiavelli", "Nuccoloy");
        map.put("Tesla", "Nikola");
        map.put("Freud", "Sigismund");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copyMap = new HashMap<>(map);
        List<String> list = new ArrayList<>();

        Iterator<Map.Entry<String, String>> iterator = copyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            String key = pair.getKey();

            Iterator<Map.Entry<String, String>> iterator2 = copyMap.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry<String, String> pair2 = iterator2.next();
                String value2 = pair2.getValue();
                String key2 = pair2.getKey();
                if (value2.equals(value) && !key2.equals(key))
                    list.add(value2);
            }
        }
        for(String s: list) {
            removeItemFromMapByValue(map, s);
        }
//        System.out.println(map);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        removeTheFirstNameDuplicates(createMap());

    }
}
