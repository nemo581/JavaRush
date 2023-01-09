package com.javarush.task.task24.task2413;

public class Canvas extends BaseObject {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[height + 2][width + 2];
    }

    public Canvas(double x, double y, double radius) {
        super(x, y, radius);
    }

    void setPoint(double x, double y, char c) {
        if (x > 0 || y > 0 || y <= matrix.length || x <= matrix[0].length) {
            matrix[(int) Math.round(y)][(int) Math.round(x)] = c;
        }
    }

    @Override
    void draw(Canvas canvas) {

    }

    void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                if (matrix[i][k] != 0) {
                    setPoint(x + k, y + i, c);
                }
            }
        }
    }

    @Override
    void move() {

    }

    public void clear() {
        matrix = new char[height + 2][width + 2];
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k]);
            }
            System.out.println();
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

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
}