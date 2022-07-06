package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        for (int i = 0; i < 40; i++) {
            System.out.println(s.substring(i));
        }
//        char[] string = s.toCharArray();
//        int i = 0;
//        for (int j = 1; j < 41; j++) {
//            while (i < string.length) {
//                System.out.print(string[i]);
//                i++;
//            }
//            System.out.println();
//            i = i - (string.length - j);
//        }
    }

}

