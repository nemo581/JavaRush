package com.javarush.task.task24.task2413;

import static java.lang.Math.max;

public abstract class BaseObject {
    private double x;
    private double y;
    private double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    protected BaseObject() {
    }

    abstract void draw(Canvas canvas);

    abstract void move();

    boolean intersects(BaseObject o) {
        return Math.sqrt((Math.pow((o.x - this.x), 2)) + (Math.pow((o.y - this.y), 2))) <= max(o.radius, this.radius);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
