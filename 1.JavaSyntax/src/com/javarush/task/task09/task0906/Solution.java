package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] methodInfo = Thread.currentThread().getStackTrace();
        StackTraceElement element = methodInfo[2];
        System.out.println(element.getClassName() + ": " + element.getMethodName() + ": " + s);


//        String message = "";
//        if (methodInfo.length >=3) {
//            StackTraceElement element = methodInfo[2];
//            String className = element.getClassName();
//            String methodName = element.getMethodName();
//            message = className + ": " + methodName + ": " + s;
//        }
//        System.out.println(message);
    }
}
