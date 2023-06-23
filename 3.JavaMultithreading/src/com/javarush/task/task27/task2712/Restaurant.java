package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;

import java.util.Observer;

public class Restaurant {
    public static void main(String[] args) {
        Observer observer = new Cook("name_1");
        Tablet tablet_1 = new Tablet(1);
        tablet_1.createOrder();
        tablet_1.addObserver(observer);
    }
}