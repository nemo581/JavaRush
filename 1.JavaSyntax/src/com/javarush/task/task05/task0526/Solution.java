package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static class Man {
        String name;
        int age;
        String address;
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }



    public static void main(String[] args) {
        Man man = new Man("Alex", 10, "City");
        Man man2 = new Man("Felix", 15, "City");
        Woman woman = new Woman("Kate", 10, "City");
        Woman woman2 = new Woman("Kill", 10, "City");

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

    }


}
