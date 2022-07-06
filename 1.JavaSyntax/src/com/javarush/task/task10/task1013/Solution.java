package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private boolean parents;
        private String children;
        private String pets;

        public Human(String name, int age, boolean sex, boolean parents, String children, String pets) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.parents = parents;
            this.children = children;
            this.pets = pets;

        }
        public Human(String name, int age, boolean sex, boolean parents, String children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.parents = parents;
            this.children = children;
        }
        public Human(String name, int age, boolean sex, boolean parents) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.parents = parents;

        }
        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;

        }
        public Human(String name, int age, boolean parents, String pets) {
            this.name = name;
            this.age = age;
            this.parents = parents;
            this.pets = pets;

        }
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, String pets) {
            this.name = name;
            this.age = age;
            this.pets = pets;
        }
        public Human(String name, boolean parents) {
            this.name = name;
            this.parents = parents;
        }
        public Human(String name) {
            this.name = name;
        }
        public Human() {

        }
    }
}
