package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader = new BufferedReader(new FileReader(reader.readLine()));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line).append(" ");
        }
        reader.close();
        line = stringBuilder.toString().trim();

        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        ArrayList<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group().toLowerCase());
        }

        String filter = "";
        for (int i = 0; i < words.size(); i++) {
            int k = i + 1;
            Pair pair = new Pair();
            pair.first = words.get(i);
            while (k < words.size()) {
                if (pair.first.equals(new StringBuilder(words.get(k)).reverse().toString()) && !pair.first.equals(filter)) {
                    pair.second = words.get(k);
                    result.add(pair);
                    filter = pair.first;
                }
                k++;
            }
        }
        for (Pair p : result) {
            System.out.println(p.first + " " + p.second);
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }

        public Pair() {
        }
    }
}