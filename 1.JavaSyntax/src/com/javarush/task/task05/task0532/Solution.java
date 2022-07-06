package com.javarush.task.task05.task0532;
import java.io.*;
/* 
Задача по алгоритмам
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0) {
            int i = a;
            int maxNum =   Integer.MIN_VALUE;

            while (i > 0) {
                int num;
                num = Integer.parseInt(reader.readLine());
                maxNum = Math.max(maxNum, num);
                i--;
            }
            System.out.println(maxNum);
        }
    }
}
