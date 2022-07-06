package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        Cat cat3 = new Cat("cat3");
        Cat cat4 = new Cat("cat4");
        Cat cat5 = new Cat("cat5");
        Cat cat6 = new Cat("cat6");
        Cat cat7 = new Cat("cat7");
        Cat cat8 = new Cat("cat8");
        Cat cat9 = new Cat("cat9");
        Cat cat10 = new Cat("cat10");

        Map<String, Cat> cats = new HashMap<>();
        cats.put("cats1", cat1);
        cats.put("cats2", cat2);
        cats.put("cats3", cat3);
        cats.put("cats4", cat4);
        cats.put("cats5", cat5);
        cats.put("cats6", cat6);
        cats.put("cats7", cat7);
        cats.put("cats8", cat8);
        cats.put("cats9", cat9);
        cats.put("cats10", cat10);

        return cats;


    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catsSet = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            catsSet.add(pair.getValue());
        }
        return catsSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
