package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Character> charToVowel = new ArrayList<>();
        ArrayList<Character> charToConsonants = new ArrayList<>();
        String str = reader.readLine();

        char[] stringToChar = str.toCharArray();
        for (int i = 0; i < stringToChar.length; i++) {
            char transit = stringToChar[i];
            if (isVowel(transit) == true) {
                charToVowel.add(transit);
            } else {
                charToConsonants.add(transit);
            }
        }

        for (int i = 0; i < charToVowel.size(); i++) {
            if (charToVowel.get(i) != ' ') {
                System.out.print(charToVowel.get(i) + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < charToConsonants.size(); i++) {
            if (charToConsonants.get(i) != ' ') {
                System.out.print(charToConsonants.get(i) + " ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}