package com.javarush.task.task29.task2909.car;

public class Truck extends Car {
    private int numberOfPassengers;

    @Override
    public int getMaxSpeed() {
        final int MAX_TRUCK_SPEED = 80;
        return MAX_TRUCK_SPEED;
    }

    public Truck(int type, int numberOfPassengers) {
        super(type, numberOfPassengers);
    }
    public Truck(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
