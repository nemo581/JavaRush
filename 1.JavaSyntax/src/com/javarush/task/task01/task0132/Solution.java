package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/



public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int num = number;
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;

        //напишите тут ваш код
    }
}