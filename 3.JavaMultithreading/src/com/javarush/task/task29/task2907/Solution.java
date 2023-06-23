package com.javarush.task.task29.task2907;

import java.math.BigDecimal;

/* 
Этот странный BigDecimal
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getValue(1.1d, 1.2d));
    }

    public static BigDecimal getValue(double v1, double v2) {
        BigDecimal bd_1 = new BigDecimal(String.valueOf(BigDecimal.valueOf(v1)));
        BigDecimal bd_2 = new BigDecimal(String.valueOf(BigDecimal.valueOf(v2)));
        return bd_1.add(bd_2);
    }
}