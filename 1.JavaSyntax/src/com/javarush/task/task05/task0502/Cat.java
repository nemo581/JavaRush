package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int winCat1 = 0;
        int winCat2 = 0;
        if (this.age > anotherCat.age) {
            winCat1++;
        }
        else if (this.age == anotherCat.age) {
            winCat1++;
            winCat2++;
        }
        else {
            winCat2++;
        }

        if (this.weight > anotherCat.weight) {
            winCat1++;
        }
        else if (this.weight == anotherCat.weight) {
            winCat1++;
            winCat2++;
        }
        else {
            winCat2++;
        }

        if (this.strength > anotherCat.strength) {
            winCat1++;
        }
        else if (this.strength == anotherCat.strength) {
            winCat1++;
            winCat2++;
        }
        else {
            winCat2++;
        }

        if (winCat1 > winCat2) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.age = 3;
        cat1.weight = 10;
        cat1.strength = 2;
        cat2.age = 1;
        cat2.weight = 15;
        cat2.strength = 1;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}
