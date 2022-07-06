package com.javarush.task.task15.task1513;

/* 
Максимально простой код-3
*/

public class Solution {
    public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine implements Runnable {
        public Machine() {

        }
    }

    public class Car extends Machine {
        String name;
//        public Car() {
//
//        }
        public Car(String name) {
            this.name = name;
        }
    }
}
