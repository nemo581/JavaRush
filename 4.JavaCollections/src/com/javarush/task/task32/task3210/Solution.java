package com.javarush.task.task32.task3210;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("\u001B[31m" + "NULL_POINTER_ARGS = 0");
            return;
        }

        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            byte[] bytes = new byte[args[2].length()];
            raf.seek(Long.parseLong(args[1]));
            raf.read(bytes, 0, bytes.length);
            String result = new String(bytes);
            raf.seek(raf.length());
            if (args[2].equals(result)) {
                raf.write("true".getBytes(StandardCharsets.UTF_8));
            } else {
                raf.write("false".getBytes(StandardCharsets.UTF_8));
            }
        } catch (FileNotFoundException f) {
            System.out.println("File_Not_Found " + args[0]);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}