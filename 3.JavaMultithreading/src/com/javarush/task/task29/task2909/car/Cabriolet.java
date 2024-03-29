package com.javarush.task.task29.task2909.car;

public class Cabriolet extends Car {
    private int numberOfPassengers;

    @Override
    public int getMaxSpeed() {
        final int MAX_CABRIOLET_SPEED = 90;
        return MAX_CABRIOLET_SPEED;
    }

    public Cabriolet(int type, int numberOfPassengers) {
        super(type, numberOfPassengers);
    }

    public Cabriolet(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
