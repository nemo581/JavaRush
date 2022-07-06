package com.javarush.task.task15.task1526;

/* 
Дебаг, дебаг, и еще раз дебаг
*/

public class Solution {
    public static void main(String[] args) {
        new B(6); // [1] получение экземпляра класса В с параметром 6 -> конструктор [16]-> [17] шаги
    } // [18] END

    public static class A {
        private int f1 = 7; // [4] почему f1 = 7 this.f1 = 7 f1 = 7???

        public A(int f1) { // [3] вызвали класс родителя с параметром f1 = 6
            this.f1 = f1; // [5] f1 = 6 почему, перезаписали private int f1 = 7 -> f1 = 6
            initialize(); // [6] вызов приват метода
        } // [9]

        private void initialize() {
            System.out.println(f1); // [7] print f1 = 6
        } // [8]
    }

    public static class B extends A {
        protected int f1 = 3; // [10] f1 = 3

        public B(int f1) { // f1 = 6
            super(f1); // [2] передаем в параметр конструктора f1 = 6
            this.f1 += f1; //  [11] this.f1 = 3; + f1 = 6... f1 = 9
            initialize(); // [12] вызов мтода
        } // [15]

        protected void initialize() {
            System.out.println(f1); // [13] принт f1 = 9
        } // [14]
    }
}
