package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        int min = 0;
        int max = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ++max) + min;
        }
        System.out.println(Arrays.toString(sort(array)));
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        double median = (array.length % 2 == 0) ? (array[(array.length / 2)] + array[(array.length / 2 - 1)]) / 2 :
                      array[(array.length + 1) / 2 - 1];

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double v1 = o1.intValue() - median;
                double v2 = o2.intValue() - median;
                return (int) ((v1 * v1 - v2 * v2) * 100);
            }
        });

//        int median = (array.length % 2 == 0) ? (array[(array.length / 2)] + array[(array.length / 2 - 1)]) / 2 :
//                array[(array.length + 1) / 2 - 1];
//        int tmp;
//        for (int i = 0; i < array.length; i++) {
//            int basic_1 = Math.abs(median - array[i]);
//            for (int k = (i + 1); k < array.length; k++) {
//                int basic_2 = Math.abs(median - array[k]);
//                if (basic_1 > basic_2) {
//                    basic_1 = basic_2;
//                    tmp = array[i];
//                    array[i] = array[k];
//                    array[k] = tmp;
//                }
//            }
//        }
        return array;
    }
}