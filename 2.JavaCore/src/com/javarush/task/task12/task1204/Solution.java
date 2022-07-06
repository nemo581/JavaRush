package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        String a = o.getClass().getSimpleName();
        if (a.equalsIgnoreCase("Cat")) {
            System.out.println("Кошка");
        }
        if (a.equalsIgnoreCase("Dog")) {
            System.out.println("Собака");
        }
        if (a.equalsIgnoreCase("Bird")) {
            System.out.println("Птица");
        }
        if (a.equalsIgnoreCase("Lamp")) {
            System.out.println("Лампа");
        }

    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
