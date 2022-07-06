package com.javarush.task.task15.task1523;

public class SubSolution extends Solution {

    SubSolution(int a) {
        super(a);
        System.out.println("SubSolution(int a)");
    }

    public SubSolution(double b) {
        super(b);
        System.out.println("public SubSolution(double b)");
    }

    protected SubSolution(float c) {
        super(c);
        System.out.println("protected SubSolution(float c)");
    }
}
