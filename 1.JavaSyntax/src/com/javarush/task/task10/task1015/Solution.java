package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] edible = new ArrayList[2];

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("cherry");
        fruit.add("orange");
        fruit.add("apricot");
        fruit.add("plum");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("potatoes");
        vegetables.add("carrot");
        vegetables.add("cabbage");
        vegetables.add("onion");
        vegetables.add("celery");
        vegetables.add("beet");

        edible[0] = fruit;
        edible[1] = vegetables;

        return edible;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}