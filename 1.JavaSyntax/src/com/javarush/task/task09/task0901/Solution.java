package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/


public class Solution {
    public static void main(String[] args) {
        method1();
    }


    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] method1 = Thread.currentThread().getStackTrace();
//        for (StackTraceElement info : method1) {
//            System.out.println(info.getClassName());
//            System.out.println(info.getMethodName());
//            System.out.println(info.getLineNumber());
//        }
        return method1;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] method2 = Thread.currentThread().getStackTrace();
//        for (StackTraceElement info : method2) {
//            System.out.println(info.getClassName());
//            System.out.println(info.getMethodName());
//            System.out.println(info.getLineNumber());
//        }
        return method2;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] method3 = Thread.currentThread().getStackTrace();
//        for (StackTraceElement info : method3) {
//            System.out.println(info.getClassName());
//            System.out.println(info.getMethodName());
//            System.out.println(info.getLineNumber());
//        }
        return method3;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] method4 = Thread.currentThread().getStackTrace();
//        for (StackTraceElement info : method4) {
//            System.out.println(info.getClassName());
//            System.out.println(info.getMethodName());
//            System.out.println(info.getLineNumber());
//        }
        return method4;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] method5 = Thread.currentThread().getStackTrace();
//        for (StackTraceElement info  : method5) {
//            System.out.println(info.getClassName());
//            System.out.println(info.getMethodName());
//            System.out.println(info.getLineNumber());
//        }
        return method5;
        //напишите тут ваш код
    }
}
