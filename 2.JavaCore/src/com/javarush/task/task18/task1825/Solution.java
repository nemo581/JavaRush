package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readerName = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, String> partsOfFile = new TreeMap<>();
        String fileName = "";
        int parts = 0;

        while (true) {
            String fullFileName = readerName.readLine();
            if (fullFileName.equals("end")) {
                readerName.close();
                break;
            }
            String[] buf = fullFileName.split("\\.");
            fileName = buf[0] + "." + buf[1];
            parts = Integer.parseInt(buf[2].replaceAll("\\D+", ""));
            partsOfFile.put(parts, fullFileName);
        }

        FileOutputStream fileOutput = new FileOutputStream(fileName, true);
        for (Map.Entry<Integer, String> pair : partsOfFile.entrySet()) {
            FileInputStream fileInput = new FileInputStream(pair.getValue());
            byte[] allbytes = new byte[fileInput.available()];
            fileInput.read(allbytes);
            fileOutput.write(allbytes);
            fileOutput.flush();
            fileInput.close();
        }
        fileOutput.close();
    }
}
