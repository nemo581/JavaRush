package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    public String getDescription() {
        String say = super.getDescription() + " Моя страна - " + Country.RUSSIA + "." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return say;
    }
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }
}
