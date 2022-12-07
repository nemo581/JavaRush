package com.javarush.task.task23.task2312;

public class SnakeSection {
    private int x;
    private int y;

    public SnakeSection(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;

        SnakeSection other = (SnakeSection) obj;
        return this.x * other.y == this.y * other.x;
    }

    @Override
    public int hashCode() {
        return 31 * (x + y);
    }
}
