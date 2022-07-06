package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String path = args[0];
        String fullPath = args[1];
//        String path = "C:/Users/AlRezn/Documents/Java/JavaRush_Projects/JavaRushTasks/testFolder";
//        String fullPath = "C:/Users/AlRezn/Documents/Java/JavaRush_Projects/JavaRushTasks/testFolder/resultFileAbsolutePath.txt";
        ArrayList<String> allFiles = new ArrayList<>();
        ArrayList<String> newFilDir = new ArrayList<>();
        File oldFile = new File(fullPath);
        File newFile = new File(oldFile.getParent() + "/allFilesContent.txt");
        if (FileUtils.isExist(oldFile)) {
            FileUtils.renameFile(oldFile, newFile);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile, true))) {
            int count = 0;
            while (true) {
                File pathFolder = new File(path);
                for (File f : pathFolder.listFiles()) {
                    if (f.isDirectory()) {
                        newFilDir.add(f.getAbsolutePath());
                    } else {
                        if (!(f.getName().equals("allFilesContent.txt")) && f.length() <= 50) {
                            allFiles.add(f.getName() + "|" + f.getAbsolutePath());
                        }
                    }
                }
                if (newFilDir.size() != 0 && count < newFilDir.size()) {
                    path = newFilDir.get(count);
                    count++;
                } else {
                    break;
                }
            }

            Collections.sort(allFiles);
            for (String s : allFiles) {
                String[] tmp = s.split("\\|");
                String buf = tmp[1];
                try (BufferedReader reader = new BufferedReader(new FileReader(buf))) {
                    while (reader.ready()) {
                        writer.write(reader.readLine() + "\n");
                    }
                }
            }
        }
    }
}
