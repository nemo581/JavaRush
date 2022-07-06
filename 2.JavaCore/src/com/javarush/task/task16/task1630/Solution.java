package com.javarush.task.task16.task1630;

import java.io.*;
/* 
Последовательный вывод файлов
*/
public class Solution {
    public static BufferedReader readFileName = new BufferedReader(new InputStreamReader(System.in));
    public static String firstFileName;
    public static String secondFileName;
    static {
        try {
            firstFileName = readFileName.readLine();
            secondFileName = readFileName.readLine();
            readFileName.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileName;
        String textInFile = "";


        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return textInFile;
        }

        public void run() {
//            System.out.println("hi");
//            System.out.println(Thread.currentThread().getName());
            String line;
            try {
                BufferedReader readFile = new BufferedReader(new FileReader(fileName));
                while ((line = readFile.readLine()) != null) {
                    textInFile = textInFile + line + " ";
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
            if (Thread.currentThread().isInterrupted()) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
}
