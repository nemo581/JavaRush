package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;
    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() {

    }

    public void move() {

    }

    public void print() {

    }

    public static void main(String[] args) {
        Hippodrome.game = new Hippodrome(new ArrayList<>());
        game.horses.add(new Horse("BlackHorse", 3.0, 0.0));
        game.horses.add(new Horse("GreenHorse", 3.0, 0.0));
        game.horses.add(new Horse("WhiteHorse", 3.0, 0.0));
    }
}
