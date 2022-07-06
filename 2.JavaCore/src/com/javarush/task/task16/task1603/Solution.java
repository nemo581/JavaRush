package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        SpecialThread objectST1 = new SpecialThread();
        objectST1.run();
        SpecialThread objectST2 = new SpecialThread();
        objectST2.run();
        SpecialThread objectST3 = new SpecialThread();
        objectST3.run();
        SpecialThread objectST4 = new SpecialThread();
        objectST4.run();
        SpecialThread objectST5 = new SpecialThread();
        objectST5.run();

        Thread objectT1 = new Thread(objectST1);
        Thread objectT2 = new Thread(objectST2);
        Thread objectT3 = new Thread(objectST3);
        Thread objectT4 = new Thread(objectST4);
        Thread objectT5 = new Thread(objectST5);

        list.add(objectT1);
        list.add(objectT2);
        list.add(objectT3);
        list.add(objectT4);
        list.add(objectT5);

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
