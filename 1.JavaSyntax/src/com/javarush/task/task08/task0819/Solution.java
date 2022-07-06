package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            count++;
            Cat x = iterator.next();
            if (count == cats.size()) {
                iterator.remove();
            }
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        for (int i = 0; i < 3; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat printCat : cats) {
            System.out.println(printCat);
        }
    }

    public static class Cat {
        public Cat () {
        }
    }
}
