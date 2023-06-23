package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    FISH(25),
    STEAK(30),
    SOUP(15),
    JUICE(5),
    WATER(3);

    private int duration;
    Dish(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString() {
        StringBuilder listOfDishes = new StringBuilder();
        for (int i = 0; i < Dish.values().length; i++) {
            if (i == Dish.values().length - 1) {
                listOfDishes.append(Dish.values()[i]);
            } else {
                listOfDishes.append(Dish.values()[i]);
                listOfDishes.append(", ");
            }
        }
        return listOfDishes.toString();
    }
}