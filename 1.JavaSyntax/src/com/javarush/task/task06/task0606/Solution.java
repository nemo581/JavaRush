package com.javarush.task.task06.task0606;
import java.io.*;
public class Solution {
    public static int even;
    public static int odd;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String len = Integer.toString(num); // преобразовали число в строку
        int lenNum = len.length(); // выявляем колличество символов в строке
        int x;
        while (lenNum > 0) {
            int fuc = (int) Math.pow(10, lenNum);
            int fucX = fuc / 10;
            x = num % fuc / fucX;
            if (x % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
            lenNum--;
            System.out.println(fuc);
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
