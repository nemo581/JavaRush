package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        text.add("a");
        text.add("b");
        text.add("c");
        text.add("d");
        text.add("e");
        System.out.println(text.size());
        for (int i = 0; i < text.size(); i++) {
            System.out.println(text.get(i));
        }


    }
}
