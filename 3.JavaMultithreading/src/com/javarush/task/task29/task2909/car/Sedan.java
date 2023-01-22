package com.javarush.task.task29.task2909.car;

public class Sedan extends Car {
    private int numberOfPassengers;

    @Override
    public int getMaxSpeed() {
        final int MAX_SEDAN_SPEED = 120;
        return MAX_SEDAN_SPEED;
    }

    public Sedan(int type, int numberOfPassengers) {
        super(type, numberOfPassengers);
    }

    public Sedan(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
