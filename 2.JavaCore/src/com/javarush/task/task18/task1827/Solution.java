package com.javarush.task.task18.task1827;

import java.io.*;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length < 4 || !(args[0].equals("-c"))) {
            System.out.println("error");
            return;
        }
        BufferedReader readFileName = new BufferedReader(new InputStreamReader(System.in));
        String productName = args[1].trim();
        String price = args[2].trim();
        String quantity = args[3].trim();
        String fileName = readFileName.readLine();
        readFileName.close();


        addProduct(fileName, productName, price, quantity);

    }

    public static void addProduct(String fileName, String productName, String price, String quantity) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line;
        int maxID = 0;
        while ((line = fileReader.readLine()) != null) {
            StringBuilder idLine = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                if (i <= 8 && Character.isDigit(line.charAt(i))) {
                    idLine.append(line.charAt(i));
                }
            }
            int id = Integer.parseInt(idLine.toString());
            if (id >= maxID) {
                maxID = id + 1;
            }
        }
        fileReader.close();

        String addProduct = String.format("\n%-8d%-30.30s%-8.8s%-4.4s", maxID, productName, price, quantity);
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
        fileWriter.write(addProduct);
        fileWriter.close();
    }
}
