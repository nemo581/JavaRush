package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());

        if (num1 > 0 && num1 % 2 == 0) {
            System.out.println("положительное четное число");
        }
        else if (num1 > 0 && num1 % 2 != 0)  {
            System.out.println("положительное нечетное число");
        }
        else  if (num1 < 0 && num1 % 2 == 0) {
            System.out.println("отрицательное четное число");
        }
        else if (num1 < 0 && num1 % 2 != 0) {
            System.out.println("отрицательное нечетное число");
        }
        else if (num1 == 0) {
            System.out.println("ноль");
        }

    }
}
