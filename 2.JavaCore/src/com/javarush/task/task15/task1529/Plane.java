package com.javarush.task.task15.task1529;
public class Plane implements CanFly{
    @Override
    public void fly() {

    }
    private final int count;
    public Plane(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }
}
