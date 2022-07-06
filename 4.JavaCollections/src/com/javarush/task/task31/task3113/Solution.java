package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/

public class Solution extends SimpleFileVisitor<Path> {
    static int countFolders = -1;
    static int countFiles = 0;
    static long size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        Path path = Paths.get(pathReader.readLine());
        pathReader.close();
        if (!(Files.isDirectory(path))) {
            System.out.println(path + " - не папка");
            return;
        }

        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                countFolders++;
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                countFiles++;
                size = size + attrs.size();
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println("Всего папок - " + countFolders);
        System.out.println("Всего файлов - " + countFiles);
        System.out.println("Общий размер - " + size);
    }
}