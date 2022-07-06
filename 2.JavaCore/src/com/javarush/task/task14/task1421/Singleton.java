package com.javarush.task.task14.task1421;

public class Singleton {
    private static Singleton instance;


    private Singleton(Singleton instance) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.instance = instance;
    }

    public static Singleton getInstance() {
        return instance;
    }

}
