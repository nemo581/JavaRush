package com.javarush.task.task25.task2514;

/* 
Первый закон Финэйгла: если эксперимент удался, что-то здесь не так...
*/

public class Solution {
    public static class YieldRunnable implements Runnable {
        private int index;

        public YieldRunnable(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            System.out.println("begin-" + index);
            Thread.yield();
            System.out.println("end-" + index);
        }
    }

    public static void main(String[] args) {
        YieldRunnable yieldRunnable1 = new YieldRunnable((int) (Math.random()*10));
        Thread thread = new Thread(yieldRunnable1);
        thread.start();

        YieldRunnable yieldRunnable2 = new YieldRunnable((int) (Math.random()*10));
        Thread thread1 = new Thread(yieldRunnable2);
        thread1.start();
    }
}
