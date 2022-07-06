package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int  age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        //System.out.println(">> Method I <<");
        this.name = name;
        this.age = 10;
        this.weight = 10;
        this.color = "Red";
    }

    public void initialize(String name, int weight, int age) {
        //System.out.println(">> Method II <<");
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Red";
    }

    public void initialize(String name, int age) {
        //System.out.println(">> Method III <<");
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "Red";
    }
    public void initialize(int weight, String color) {
        //System.out.println(">> Method IV <<");
        this.age = 10;
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight, String color, String address) {
        //System.out.println(">> Method V <<");
        this.age = 10;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
