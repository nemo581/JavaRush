package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* 
Запись в существующий файл
*/

public class Solution {
    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("\u001B[31m" + "NULL_POINTER_ARGS = 0");
            return;
        }

        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            long fileLength = raf.length();
            long point = Long.parseLong(args[1]);
            raf.seek(Math.min(point, fileLength));
            raf.write(args[2].getBytes(StandardCharsets.UTF_8));

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
