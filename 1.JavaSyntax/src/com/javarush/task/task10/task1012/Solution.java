package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        int count = 0;
        Map <Character, Integer> mapList = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            mapList.put(alphabet.get(i), count);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                Character character = list.get(i).charAt(j);
                for (Map.Entry<Character, Integer> forSort : mapList.entrySet()) {
                    Character key = forSort.getKey();
                    if (key.equals(character)) {
                        mapList.put(key, mapList.get(character) + 1);
                    }
                }
            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            for (Map.Entry<Character, Integer> printMap : mapList.entrySet()) {
                if (alphabet.get(i).equals(printMap.getKey())) {
                    System.out.println(printMap.getKey() + " " + printMap.getValue());
                }
            }
        }
    }
}
