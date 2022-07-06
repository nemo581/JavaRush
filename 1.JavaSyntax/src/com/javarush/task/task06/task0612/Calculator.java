package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int res = a + b;
        return res;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код

        int res = a - b;
        return res;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int res = a * b;
        return res;
    }

    public static double division(int a, int b) { // начальный тип параметров int a, int b
        //напишите тут ваш код                          // поменял на double
        double res = (double) a / b;
        return res;
    }

    public static double percent(int a, int b) { // начальный тип параметра int a, int b
        double res = (double) a / 100 * b;                      // поменял на double
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Division num (a=10; b=7) = " + division(10, 3));
        System.out.println("Percent num (a=50; b=70) = " + percent(50, 70));

    }
}