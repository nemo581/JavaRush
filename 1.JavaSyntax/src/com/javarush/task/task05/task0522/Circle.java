package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 2;
    }
    public Circle(double radius) {
        this.y = 3;
        this.x = 3;
        this.radius = radius;
    }
    public Circle() {   // Е С Л И   П Р А В И Л Ь Н О   П О Н Я Л
        this(1, 1, 1);  // Э Т О   К О Н С Т Р У. ПО  У М О Л Ч А Н И Ю//
    }
    public static void main(String[] args) {
//        Circle a = new Circle();
//        System.out.println(a.x + " " + a.y + " " + a.radius);

        Circle b = new Circle(0, 0, 0);
        System.out.println(b.x + " " + b.y + " " + b.radius);

//        Circle c = new Circle(2, 2);
//        System.out.println(c.x + " " + c.y + " " + c.radius);

//        Circle d = new Circle(3);
//        System.out.println(d.x + " " + d.y + " " + d.radius);
    }
}