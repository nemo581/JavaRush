package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/
import java.io.*;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> bufer = new HashMap<>();
        while (true) {
            int id;
            try {
                id = Integer.parseInt(reader.readLine());
            }
            catch (NumberFormatException e) {
                break;
            }
            String name = reader.readLine();

            for (HashMap.Entry<String, Integer> cash : bufer.entrySet()) {
                while (name.equalsIgnoreCase(cash.getKey())) {
                    System.out.println("повторите ввод.");
                    name = reader.readLine();
                }
            }
            if (name.isEmpty()) {
                System.out.println(id);
                break;
            }
            bufer.put(name, id);
        }
        for (HashMap.Entry<String, Integer> print : bufer.entrySet()) {
            System.out.println(print.getValue() + " " + print.getKey());
        }
    }
}
