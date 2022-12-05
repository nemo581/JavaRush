package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) {
            return false;
        }
        return (telNumber.matches("^\\+(\\d[()]?){12}$") || telNumber.matches("^([()]?\\d){10}$"))
                && telNumber.matches("^(\\+)?(\\d+)?(\\(\\d{3}\\))?\\d+$");
    }

    public static void main(String[] args) {

//        String[] str = {
//                "+380501234567",
//                "+38(050)1234567",
//                "(050)1234567",
//                "0(501)234567",
//                "+38)050(1234567",
//                "+38(050)123-45-67",
//                "050ххх4567",
//                "050123456",
//                "(0)501234567"
//        };
//
//        for (String s : str) {
//            if (checkTelNumber(s)) {
//                System.out.println(s);
//            }
//        }

    }
}
