package com.javarush.task.task06.task0619;

/* 
Три статические переменные name
*/

public class Solution {
    public static String name;

    public static class Cat {
        public static String name = "Cat Name";
    }

    public static class Dog {
        public static String name = "Dog Name";
    }


    public static void main(String[] args) {
        System.out.println(Cat.name);
        System.out.println(Dog.name);

    }
}
