package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;

/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<String> treeSet = new TreeSet<>();
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            int i = -1;
            String temp;
            while ((i = fileInputStream.read()) != -1) {
                if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
                    temp = String.valueOf((char) i);
                    treeSet.add(temp.toLowerCase(Locale.ROOT));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (treeSet.size() > 5) {
            int i = 5;
            Iterator<String> iterator = treeSet.iterator();
            while (i != 0) {
                System.out.print(iterator.next());
                i--;
            }
        } else {
            for (String s : treeSet) {
                System.out.print(s);
            }
        }
    }
}