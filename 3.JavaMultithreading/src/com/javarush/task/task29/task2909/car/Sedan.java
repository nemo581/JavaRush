package com.javarush.task.task29.task2909.car;

public class Sedan extends Car {
    private int numberOfPassengers;
    public Sedan(int type, int numberOfPassengers) {
        super(type, numberOfPassengers);
    }

    public Sedan(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
