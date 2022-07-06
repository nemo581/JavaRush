package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        String[] buffer = new String[]{"cartoon", "thriller", "soapOpera"};
        boolean check = true;
        int count = 0;
        while (check) {
            key = reader.readLine();
            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i].equals(key)) {
                    Movie movie = MovieFactory.getMovie(key);
                    System.out.println(movie.getClass().getSimpleName());
                }
                else {
                    count++;
                }
                if (count == buffer.length) {
                    Movie movie = MovieFactory.getMovie(key);
                    check = false;
                }
            }
            count = 0;
        }
    }

    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie = null;
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
