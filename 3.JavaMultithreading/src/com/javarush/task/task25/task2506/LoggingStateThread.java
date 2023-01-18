package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread target;

    @Override
    public void run() {
        Thread.State tr = this.target.getState();
        System.out.println(tr);
        while (true) {
            if (tr != this.target.getState()) {
                tr = this.target.getState();
                System.out.println(tr);
            }

            if (tr == State.TERMINATED) {
                return;
            }
        }
    }

    public LoggingStateThread(Thread target) {
        this.target = target;
    }
}