package com.javarush.task.task16.task1629;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
Только по-очереди!
*/
public class Solution {
    public static volatile Boolean isMyFlag = false;
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        //while (!isMyFlag) {}
        t1.interrupt();
        t2.interrupt();
        try {
            reader.close();
        } catch (IOException e) {
            System.out.println("error in main");
        }
        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        String outReader;
        StringBuilder builder = new StringBuilder();
        public void printResult() {
            System.out.println(this.builder.toString().trim());
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    outReader = reader.readLine();
                    builder.append(outReader).append(" ");
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
            isMyFlag = true;
        }
    }
}
