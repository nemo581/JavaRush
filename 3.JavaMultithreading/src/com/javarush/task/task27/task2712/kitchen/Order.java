package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
        ConsoleHelper.writeMessage(toString());
    }

    @Override
    public String toString() {
        if (dishes.size() == 0) {
            return "";
        } else {
            return "Your order: " + dishes + " of " + tablet;
        }
    }
}