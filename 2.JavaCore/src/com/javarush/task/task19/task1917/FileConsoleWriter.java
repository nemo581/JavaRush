package com.javarush.task.task19.task1917;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/* 
Свой FileWriter
*/

public class FileConsoleWriter {
    private FileWriter fileWriter;


    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);

    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        this.fileWriter = new FileWriter(fd);
    }


    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        System.out.println(String.copyValueOf(cbuf, off, len));
    }
    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);

    }
    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }
    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println((str).substring(off, len + off));

    }
    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        for (char a : cbuf) {
            System.out.print(a);
        }
    }
    public void close() throws IOException {
        fileWriter.close();

    }


    public static void main(String[] args) throws IOException {
//        String x = "madagaskar";
//        char[] y = x.toCharArray();
//        FileConsoleWriter consoleWriter = new FileConsoleWriter("1.txt");
//        consoleWriter.write(y, 2, 5);
//        consoleWriter.close();
    }

}
