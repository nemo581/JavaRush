package com.javarush.task.task15.task1517;

import org.w3c.dom.html.HTMLTableRowElement;

/*
Статики и исключения
*/
public class Solution {
    public static int A = 0;
    static {
        A = A / A;

    }

    public static int B = 5;
    public static void main(String[] args) {
        System.out.println(B);
    }
}


