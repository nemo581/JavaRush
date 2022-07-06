package com.javarush.task.task18.task1823;
import java.io.*;
import java.util.*;
/* 
Нити и байты
*/
public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader readFileName = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        ReadThread thread = null;
        while (true) {
            fileName = readFileName.readLine();
            if (fileName.equals("exit")) {
                readFileName.close();
                break;
            }
            thread = new ReadThread(fileName);
            thread.start();
        }

        if (Thread.currentThread().isAlive()) {
            thread.interrupt();
        }
    }

    public static class ReadThread extends Thread  {
        private String name;
        public ReadThread(String fileName) {
            this.name = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public synchronized void run() {

            try {
                FileInputStream fileInput = new FileInputStream(name);
                ArrayList<Integer> list = new ArrayList<>();
                while (fileInput.available() > 0) {
                    list.add(fileInput.read());
                }
                if (list.size() != 0) {
                    int count = 1;
                    int max = 0;
                    int index = 0;
                    for (int i = 0; i < list.size(); i++) {
                        for (int k = 1; k < list.size(); k++) {
                            if (list.get(i).equals(list.get(k))) {
                                count++;
                            }
                        }
                        if (count > max) {
                            max = count;
                            index = i;
                        }
                        count = 0;
                    }
                    resultMap.put(this.name, list.get(index));
                }
                fileInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
