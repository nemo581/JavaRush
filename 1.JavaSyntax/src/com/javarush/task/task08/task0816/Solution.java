package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Stallone", dateFormat.parse("July 6 1946"));
        map.put("Hitchcock", dateFormat.parse("August 13 1899"));
        map.put("Spilberg", dateFormat.parse("December 18 1946"));
        map.put("Douglas", dateFormat.parse("September 25 1944"));
        map.put("Van Damm", dateFormat.parse("October 18 1960"));
        map.put("Twain", dateFormat.parse("November 30 1835"));
        map.put("Shelby", dateFormat.parse("May 10 1923"));
        map.put("Machiavelli", dateFormat.parse("May 3 1469"));
        map.put("Tesla", dateFormat.parse("July 10 1856"));
        map.put("Freud", dateFormat.parse("MAY 6 1856"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            if (value.getMonth() > 4 && value.getMonth() < 8) {
                iterator.remove();
            }
        }
        System.out.println(map);
//        for (Map.Entry<String, Date> pair : map.entrySet()) {
//            Date value = pair.getValue();
//            if (value.getMonth() > 4 && value.getMonth() < 8) {
//                iterator.remove();
//            }
//        }
    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
    }
}
