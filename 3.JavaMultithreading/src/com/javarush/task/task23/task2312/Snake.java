package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive = true;
    private SnakeDirection direction;

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public Snake(int x, int y) {
        sections = new ArrayList<>();
        sections.add(new SnakeSection(x, y));
    }
    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void move() {
        if (isAlive) {
            if (this.direction.equals(SnakeDirection.UP)) {
                move(0, -1);
            }
            if (this.direction.equals(SnakeDirection.RIGHT)) {
                move(1, 0);
            }
            if (this.direction.equals(SnakeDirection.DOWN)) {
                move(0, 1);
            }
            if (this.direction.equals(SnakeDirection.LEFT)) {
                move(-1, 0);
            }
        }
    }

    public void move(int x, int y) {
    }
}
