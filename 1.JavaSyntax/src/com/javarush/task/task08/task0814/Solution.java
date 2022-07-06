package com.javarush.task.task08.task0814;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        int min = 1;
        int max = 35;
        while (set.size() < 20) {
            int ranNum = (int) (Math.random() * (max - min) + min);
            set.add(ranNum);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }

        return set;
    }

    public static void main(String[] args) {

        System.out.println("removeAllNumbers...Than10 " + removeAllNumbersGreaterThan10(createSet()));

    }
}
