package com.javarush.task.task25.task2512;

/*
Живем своим умом
*/

import java.util.ArrayList;

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        ArrayList<Throwable> list = new ArrayList<>();
        Throwable x = e;
        while (true) {
            if (x.getCause() != null) {
                list.add(x);
                x = x.getCause();
            } else {
                list.add(x);
                break;
            }
        }

        for (int i = list.size() - 1; i >= 0; i--)
        System.out.println(list.get(i));
    }

    private static Throwable ex(Throwable t) {
        return t.getCause();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.uncaughtException(new Thread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
