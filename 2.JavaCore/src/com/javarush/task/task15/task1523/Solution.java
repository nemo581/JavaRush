package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    int a;
    double b;
    float c;

    Solution(int a) {
        this.a = a;
        System.out.println("Solution(int a)");
    }

    public Solution(double b) {
        this.b = b;
        System.out.println("public Solution(double b)");
    }

    protected Solution(float c) {
        this.c = c;
        System.out.println("protected Solution(float c)");
    }

    private Solution() {
        System.out.println("private Solution()");
    }

    public static void main(String[] args) {
        SubSolution testOne = new SubSolution(1);
        Solution testTwo = new SubSolution(2.5);

    }
}

