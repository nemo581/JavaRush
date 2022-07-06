package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-d");
        Date date = dateFormat.parse(reader.readLine());
        System.out.println(new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).format(date).toUpperCase());

    }
}
