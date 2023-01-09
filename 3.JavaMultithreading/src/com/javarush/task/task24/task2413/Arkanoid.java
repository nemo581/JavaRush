package com.javarush.task.task24.task2413;

import java.util.List;

public class Arkanoid {
    private int width;
    private int height;

    private Ball ball;
    private Stand stand;
    private List<Brick> bricks;

    public static Arkanoid game;
    private boolean isGameOver;

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void run() {

    }

    public void move() {
        getBall().move();
        getStand().move();
    }

    public void checkBricksBump() {
        for (Brick brick : getBricks()) {
            if (brick.intersects(getBall())) {
                double angle = Math.random() * 360;
                ball.setDirection(angle);
                getBricks().remove(brick);
                break;
            }
        }
    }

    public void checkStandBump() {
        if (getBall().intersects(getStand())) {
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }

    public void checkEndGame() {
        if (getBall().y > height) {
            isGameOver = true;
        }
    }

    void draw(Canvas canvas) {
        getBall().draw(canvas);
        getStand().draw(canvas);
        for (Brick brick : getBricks()) {
            brick.draw(canvas);
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public static void main(String[] args) {

    }
}