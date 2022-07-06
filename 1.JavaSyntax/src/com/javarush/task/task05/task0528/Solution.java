package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;


public class Solution {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;

        dateFormat = new SimpleDateFormat("dd MM YYYY");
        System.out.println(dateFormat.format( currentDate ));
    }
}
