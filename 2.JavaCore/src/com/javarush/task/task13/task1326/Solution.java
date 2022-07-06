package com.javarush.task.task13.task1326;


// C:\Users\AlRezn\Desktop\2.txt


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(reader.readLine());

        ArrayList<Character> charList = new ArrayList<>();
        while (inStream.available() > 0) {
            char addList = (char) inStream.read();
            charList.add(addList);
        }
        inStream.close();
        reader.close();

        ArrayList<Integer> intList = new ArrayList<>();
        Iterator<Character> charIterator = charList.iterator();
        String temp = "";
        while (charIterator.hasNext()) {
            char x = charIterator.next();
            if ((x == '-') && (temp.equals(""))) {
                temp = temp + '-';
            } else if (Character.isDigit(x)) {
                temp = temp + x;
            } else if (!((temp.equals("")) || (temp.equals("-")))) {
                intList.add(Integer.parseInt(temp));
                temp = "";
            }
        }
        if (!((temp.equals("")) || (temp.equals("-"))))
            intList.add(Integer.parseInt(temp));


        ArrayList<Integer> sortedList = new ArrayList<>();
        Iterator<Integer> forSort = intList.iterator();
        while (forSort.hasNext()) {
            int x = forSort.next();
            if (x % 2 == 0) {
                sortedList.add(x);
            }
        }


        Collections.sort(sortedList);
        Iterator<Integer> sorted = sortedList.iterator();
        while (sorted.hasNext()) {
            System.out.println(sorted.next());
        }
    }
}

