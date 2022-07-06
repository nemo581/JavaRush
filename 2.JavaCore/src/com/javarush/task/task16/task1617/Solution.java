package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
//        clock.start();
        clock.interrupt();

        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
//                if (numSeconds > 3) {                                 // Проверка не пройдена
//                    throw new InterruptedException();
//                }
                while (!Thread.currentThread().isInterrupted()) {
                    while (numSeconds >= 0) {
                        if (numSeconds >  0) {
                            System.out.print(numSeconds + " ");
//                            Thread.sleep(1000);                       // Проверка не пройдена
                        } else if (numSeconds == 0) {
                            System.out.print("Марш!");
                        }
                        numSeconds--;
                        Thread.sleep(1000);                        // Проверка пройдена
                    }
                }
            } catch (InterruptedException e) {
                while (numSeconds >= 0) {
                    if (numSeconds == 0) {
                        System.out.print("Прервано!");
                    } else {
                        System.out.print(numSeconds + " ");
                    }
                    numSeconds--;
                }

//                while (numSeconds >= 0) {                               // Проверка не пройдена
//                    if (numSeconds > 0) {
//                        System.out.print(numSeconds + " ");
//                    } else if (numSeconds == 0) {
//                        System.out.print("Прервано!");
//                    }
//                    numSeconds--;
//                }
            }
        }
    }
}
