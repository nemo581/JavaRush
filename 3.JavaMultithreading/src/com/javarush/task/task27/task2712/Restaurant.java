package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet_1 = new Tablet(1);
        Cook cook = new Cook("name_1");
        cook.addObserver(new Waiter());
        tablet_1.addObserver(cook);
        tablet_1.createOrder();
    }
}