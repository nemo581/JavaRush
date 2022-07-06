package com.javarush.task.task14.task1408;

abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        String say = "Я - курица.";
        return say;
    }
}



