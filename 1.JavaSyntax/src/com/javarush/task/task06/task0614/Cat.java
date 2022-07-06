package com.javarush.task.task06.task0614;

import java.util.ArrayList;
import java.util.List;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
        cats.add(this);
    }
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());
        }
//        System.out.println(cats.size());
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
