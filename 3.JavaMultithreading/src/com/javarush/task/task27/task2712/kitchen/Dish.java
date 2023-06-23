package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    FISH,
    STEAK,
    SOUP,
    JUICE,
    WATER;

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