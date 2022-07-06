package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {


    public static double getDistance(int x1, int y1, int x2, int y2) {
        //double x = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
        double a = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        return a;
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        Util.getDistance(1, 2, 3,4 );



    }
}
