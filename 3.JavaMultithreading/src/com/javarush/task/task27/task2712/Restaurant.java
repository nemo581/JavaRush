package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;
import com.javarush.task.task27.task2712.kitchen.Order;

import java.io.IOException;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet_1 = new Tablet(1);
        tablet_1.createOrder();

        Tablet tablet_2 = new Tablet(2);
        tablet_2.createOrder();

        Tablet tablet_3 = new Tablet(3);
        tablet_3.createOrder();

        Tablet tablet_4 = new Tablet(4);
        tablet_4.createOrder();
    }
}