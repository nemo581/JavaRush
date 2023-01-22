package com.javarush.task.task25.task2510;

/* 
Поживем - увидим
*/

public class Solution extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            throw new Throwable();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public Solution() {
        this.setUncaughtExceptionHandler((t, e) -> {
            if (e instanceof Error) System.out.println("Нельзя дальше работать");
            else if (e instanceof Exception) System.out.println("Надо обработать");
            else if (e instanceof Throwable) System.out.println("Поживем - увидим");
        });
    }

    public static void main(String[] args) {
        Thread thread = new Solution();
        thread.start();
    }
}
