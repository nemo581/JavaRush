package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader buffReadF1 = null;
        BufferedReader buffReadF2 = null;

        try {
            buffReadF1 = new BufferedReader(new FileReader(file1));
            buffReadF2 = new BufferedReader(new FileReader(file2));
            String lines;
            while ((lines = buffReadF1.readLine()) != null) {
                allLines.add(lines);
            }
            String removeLines;
            while ((removeLines = buffReadF2.readLine()) != null) {
                forRemoveLines.add(removeLines);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                buffReadF1.close();
                buffReadF2.close();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        solution.joinData();

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
