package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
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
        else if (className.equalsIgnoreCase("Pig")) {
            className = "Свинья";
        }
        else {
            className = "Животное";
        }



        return className;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
