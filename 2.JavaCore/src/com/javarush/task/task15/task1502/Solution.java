package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution {
    //добавьте классы Goose и Dragon тут

    public static void main(String[] args) {
        Goose goose = new Goose();
        System.out.println(goose.getSize());

        Dragon dragon = new Dragon();
        System.out.println(dragon.getSize());

    }

    public static class Goose extends SmallAnimal {
        @Override
        public String getSize() {
            String sizeGoose = "Гусь маленький, " + super.getSize();
            return sizeGoose;
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            String sizeDragon = "Дракон большой, " + super.getSize();
            return sizeDragon;
        }
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
