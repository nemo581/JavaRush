package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    public String getDescription() {
        String say = super.getDescription() + " Моя страна - " + Country.BELARUS + "." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return say;
    }
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }
}
