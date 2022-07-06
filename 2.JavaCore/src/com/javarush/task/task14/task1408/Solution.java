package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.MOLDOVA);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {
        static Hen getHen(String country) {
            Hen hen = null;
//            if (Country.UKRAINE.equals(country)) {
//                hen = new UkrainianHen();
//            } else
//            if (Country.RUSSIA.equals(country)) {
//                hen = new RussianHen();
//            } else
//            if (Country.MOLDOVA.equals(country)) {
//                hen = new MoldovanHen();
//            } else
//            if (Country.BELARUS.equals(country)) {
//                hen = new BelarusianHen();
//            }
            switch (country) {
                case Country.RUSSIA: hen = new RussianHen();        break;
                case Country.BELARUS: hen = new BelarusianHen();    break;
                case Country.MOLDOVA: hen = new MoldovanHen();      break;
                case Country.UKRAINE: hen = new UkrainianHen();     break;
                default:
            }
            return hen;
        }
    }
}
