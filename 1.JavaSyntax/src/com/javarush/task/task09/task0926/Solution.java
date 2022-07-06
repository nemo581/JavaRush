package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] array0 = new int[] {1, 5, 6, 5, 8};
        int[] array1 = new int[] {2, 5};
        int[] array2 = new int[] {4, 8, 2, 7};
        int[] array3 = new int[] {4, 5, 6, 8, 9, 5, 7};
        int[] array4 = new int[0];
        list.add(array0);
        list.add(array1);
        list.add(array2);
        list.add(array3);
        list.add(array4);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
