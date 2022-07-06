package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> noChild = new ArrayList<>();

        ArrayList<Human> yongSchool = new ArrayList<>();
        yongSchool.add(new Human("Ребенок 1", true, 1, noChild));
        yongSchool.add(new Human("Ребенок 2",true, 1, noChild));
        yongSchool.add(new Human("Ребенок 3", false, 3, noChild));

        ArrayList<Human> middleSchool1 = new ArrayList<>();
        middleSchool1.add(new Human("Мама", false, 25, yongSchool));

        ArrayList<Human> middleSchool2 = new ArrayList<>();
        middleSchool2.add(new Human("Отец", true, 25, yongSchool));

        ArrayList<Human> oldSchool1 = new ArrayList<>();
        oldSchool1.add(new Human("Дедушка 1", true, 60, middleSchool1));
        oldSchool1.add(new Human("Бабушка 1", false, 60, middleSchool1));

        ArrayList<Human> oldSchool2 = new ArrayList<>();
        oldSchool2.add(new Human("Дедушка 2", true, 60, middleSchool2));
        oldSchool2.add(new Human("Бабушка 2", false, 60, middleSchool2));

        for (Human s : oldSchool1) {
            System.out.println(s.toString());
        }
        for (Human s : oldSchool2) {
            System.out.println(s.toString());
        }
        for (Human s : middleSchool1) {
            System.out.println(s.toString());
        }
        for (Human s : middleSchool2) {
            System.out.println(s.toString());
        }
        for (Human s : yongSchool) {
            System.out.println(s.toString());
        }
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, Boolean sex, int age, ArrayList<Human> children) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = children;
        }

        public Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;


            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
