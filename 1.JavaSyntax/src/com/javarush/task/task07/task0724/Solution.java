package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import javax.net.ssl.HandshakeCompletedListener;

public class Solution {
    public static void main(String[] args) {
        Human grandMaVasillisa = new Human("Василиса", true, 80);
        Human grandPaMihail = new Human("Михаил", false, 85);
        Human grandMaMaria = new Human("Мария", true, 60);
        Human grandPaVasiliy = new Human("Василий", false, 66);
        Human motherRita = new Human("Рита", true,40, grandMaVasillisa, grandPaMihail);
        Human fatherNikolay = new Human("Николай", false, 42, grandPaVasiliy, grandMaVasillisa);
        Human ekaterina = new Human("Екатерина", true, 26, motherRita, fatherNikolay);
        Human alex = new Human("Алекс", false, 28, motherRita, fatherNikolay);
        Human julia = new Human("Юля", true, 24, motherRita, fatherNikolay);


        System.out.println(grandMaVasillisa);
        System.out.println(grandPaMihail);
        System.out.println(grandMaMaria);
        System.out.println(grandPaVasiliy);
        System.out.println(motherRita);
        System.out.println(fatherNikolay);
        System.out.println(ekaterina);
        System.out.println(alex);
        System.out.println(julia);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}