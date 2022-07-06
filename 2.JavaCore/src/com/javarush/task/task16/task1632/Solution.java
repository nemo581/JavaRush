package com.javarush.task.task16.task1632;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(6);
    static {
        threads.add(0, new EndlessChallenge("Thread 1"));
        threads.add(1, new ThreadThrowsException("Thread 2"));
        threads.add(2, new OutUra("Thread 3"));
        threads.add(3, new ImplMess("Thread 4"));
        threads.add(4, new BufferRead("Thread 5"));
        threads.add(5, new ImplMess("Thread 66"));
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println(threads);
//        threads.get(0).start();
//        threads.get(1).start();
//        threads.get(2).start();
        threads.get(3).start();
//        threads.get(4).start();
        threads.get(5).start();

        ImplMess firstT = new ImplMess("1");
        ImplMess secondT = new ImplMess("2");

        firstT.start();
        secondT.start();

        /////

        secondT.showWarning();



        Thread.sleep(10);
        ImplMess implMessy = (ImplMess)threads.get(3);
        implMessy.showWarning();
    }

    public static class EndlessChallenge extends Thread {
        private String name;
        public  EndlessChallenge(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class ThreadThrowsException extends Thread {

        String name;
        public  ThreadThrowsException(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class OutUra extends Thread {
        String name;
        public  OutUra(String name) {
            this.name = name;
        }

        @Override
        public void run() {

            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public static class ImplMess extends Thread implements Message {
        String name;
        public ImplMess(String name) {
            this.name = name;
        }
        @Override
        public void showWarning() {
            System.out.println(Thread.currentThread());
            System.out.println("Thread ud " + Thread.currentThread().isInterrupted());
            this.interrupt();
            System.out.println("Thread down " + Thread.currentThread().isInterrupted());
        }

        @Override
        public void run() {
            while (!this.isInterrupted()) {
                System.out.println("Thread in While " + threads.get(3).isAlive());
            }
        }
    }

    public static class BufferRead extends Thread  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inNum = 0;
        int summ = 0;
        String inString;
        String name;
        public BufferRead(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while (true) {
                try {   //
                    inString = reader.readLine();
                    try {
                        inNum = Integer.parseInt(inString);
                        summ = summ + inNum;
                    } catch (NumberFormatException i) {
                        if (inString.equals("N")) {
                            System.out.println(summ);
                            threads.get(4).interrupt();
                            reader.close();
                            break;
                        }
                    }
                } catch (IOException e) {
                }
            }
        }
    }
}