package com.javarush.task.task08.task0812;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(list);

        int j = 0;
        int max = 1;
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(j).equals(list.get(i))) {
//            if (list.get(j) == list.get(i)) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                j = i;
                count = 1;
            }
        }
        System.out.println("max: " + max);
//        System.out.println(max);

    }
}