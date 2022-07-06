package com.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;
/* 
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        Person zjuk = new Person("Zjuk");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }

        for (Money money : zjuk.getAllMoney()) {
            System.out.println(zjuk.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();

            Money rub = new Ruble(50);
            Money uah = new Hrivna(150);
            Money usd = new USD(10);
            allMoney.add(rub);
            allMoney.add(uah);
            allMoney.add(usd);
        }

        private List<Money> allMoney;


        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
