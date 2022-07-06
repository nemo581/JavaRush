package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class Solution {
    public static void main(String[] args) {

        Idea mainIdea = new Idea();
        printIdea(mainIdea);

        printIdea(new Idea());
        printIdea(new Idea());
    }

    public static class Idea {

        public String getDescription() {
            return "Blk";
        }
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }
    public static void printIdea2(Idea idea2) {

    }

}
