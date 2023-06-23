package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    private static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        try {
            return consoleReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Dish> getAllDishesForOrder() {
        List<Dish> choiceList = new ArrayList<>();
        writeMessage(Dish.allDishesToString() + "\nВыберите название блюда:\n");
        try {
            while (true) {
                String choice = consoleReader.readLine().toUpperCase().trim();
                if (choice.equalsIgnoreCase("exit")) break;
                try {
                    choiceList.add(Enum.valueOf(Dish.class, choice));
                } catch (IllegalArgumentException e) {
                    writeMessage("такого блюда нет");
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return choiceList;
    }
}