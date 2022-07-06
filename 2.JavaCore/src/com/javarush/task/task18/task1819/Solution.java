package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fName_1 = reader.readLine();
        String fName_2 = reader.readLine();
        reader.close();
        ArrayList<String> buf = new ArrayList<>();

        BufferedReader fileR = new BufferedReader(new FileReader(fName_1));
        while (fileR.ready()) {
            buf.add(fileR.readLine());
        }
        fileR.close();

        BufferedWriter fileWr = new BufferedWriter(new FileWriter(fName_1));
        BufferedReader fileR_2 = new BufferedReader(new FileReader(fName_2));
        while (fileR_2.ready()) {
            fileWr.write(fileR_2.readLine());
        }
        fileR_2.close();
        for(String bufer : buf) {
            fileWr.write(bufer);
        }
        fileWr.close();
    }
}
