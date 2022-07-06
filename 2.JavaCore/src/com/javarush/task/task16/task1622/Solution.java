package com.javarush.task.task16.task1622;
/*
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
*/
public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();   // create 4 new thread
        }
    }


    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0; // Thread Name
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                try {
                    Thread.sleep(10);
                    Thread.currentThread().interrupt();
                } catch (InterruptedException e) {
                    System.out.println("Нить прервана");
                }
                System.out.println(this);
                if (--countdownIndex == 0) return;
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}