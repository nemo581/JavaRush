package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file_reader_1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file_reader_2 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        ArrayList<String> list_1 = new ArrayList<>();
        ArrayList<String> list_2 = new ArrayList<>();
        while (file_reader_1.ready()) {
            list_1.add(file_reader_1.readLine());
        }
        file_reader_1.close();
        while (file_reader_2.ready()) {
            list_2.add(file_reader_2.readLine());
        }
        file_reader_2.close();

        int oldFileLines = 0;
        int newFileName = 0;
        while (true) {
            if (list_1.get(oldFileLines).equals( list_2.get(newFileName))) {
                lines.add(new LineItem(Type.SAME, list_1.get(oldFileLines)));
                oldFileLines++;
                newFileName++;
            } else if (list_1.get(oldFileLines + 1).equals(list_2.get(newFileName))) {
                lines.add(new LineItem(Type.REMOVED, list_1.get(oldFileLines)));
                oldFileLines += 1;
            } else {
                lines.add(new LineItem(Type.ADDED, list_2.get(newFileName)));
                oldFileLines +=0 ;
                newFileName++;
            }
            if (oldFileLines == list_1.size() && newFileName < list_2.size()) {
                while (newFileName < list_2.size()) {
                    lines.add(new LineItem(Type.ADDED, list_2.get(newFileName)));
                    newFileName++;
                }
                break;
            }
            if (newFileName == list_2.size() && oldFileLines < list_1.size()) {
                while (oldFileLines < list_1.size()) {
                    lines.add(new LineItem(Type.REMOVED, list_1.get(oldFileLines)));
                    oldFileLines++;
                }
                break;
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
