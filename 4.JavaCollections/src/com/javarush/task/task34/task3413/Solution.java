package com.javarush.task.task34.task3413;

/* 
Кеш на основании SoftReference
*/

public class Solution {
    public static void main(String[] args) {
        SoftCache cache = new SoftCache();

        for (long i = 1; i < 10; i++) {
            cache.put(i, new AnyObject(i, null, null));
        }
    }
}