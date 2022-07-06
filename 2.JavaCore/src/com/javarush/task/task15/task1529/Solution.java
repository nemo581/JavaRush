package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {
        if (result instanceof Helicopter) {
            System.out.println("Helicopter true");
        } else if (result instanceof Plane) {
            System.out.println("Plane " + (result instanceof Plane) + ", count: " + ((Plane) result).getCount());
        }
    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        if (text.equals("helicopter")) {
            result = new Helicopter();
            reader.close();
        } else if (text.equals("plane")) {
            int num = Integer.parseInt(reader.readLine());
            result = new Plane(num);
            reader.close();
        } else {
            reader.close();
        }
    }
}
