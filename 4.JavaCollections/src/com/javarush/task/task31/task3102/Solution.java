package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        ArrayList<String> allFiles = new ArrayList<>();
        ArrayList<String> dir = new ArrayList<>();

        int id = 0;
        while (true) {
            File file = new File(root);
            for (File f : file.listFiles()) {
                if (f.isDirectory()) {
                    dir.add(f.getAbsolutePath());
                } else {
                    allFiles.add(f.getAbsolutePath());
                }
            }

            if (dir.size() != 0 && id < dir.size()) {
                root = dir.get(id);
                id++;
            } else {
                break;
            }
        }
        return allFiles;
    }

    public static void main(String[] args) throws IOException {

    }
}
