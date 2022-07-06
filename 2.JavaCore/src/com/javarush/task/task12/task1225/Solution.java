package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String className = o.getClass().getSimpleName();
        if (className.equalsIgnoreCase("Cat")) {
            className = "Кот";
        }
        else if (className.equalsIgnoreCase("Tiger")) {
            className = "Тигр";
        }
        else if (className.equalsIgnoreCase("Lion")) {
            className = "Лев";
        }
        else if (className.equalsIgnoreCase("Bull")) {
            className = "Бык";
        }
        else if (className.equalsIgnoreCase("Cow")) {
            className = "Корова";
        }
        else  if (className.equalsIgnoreCase("Animal")) {
            className = "Животное";
        }


        return className;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
