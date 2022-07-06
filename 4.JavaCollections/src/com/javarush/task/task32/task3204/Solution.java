package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* 
Генератор паролей
*/

public class Solution {
    static Set<ByteArrayOutputStream> data = new HashSet<>();


    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        boolean countX = false;
        boolean countY = false;
        boolean countZ = false;

        while (byteArrayOutputStream.size() < 8) {
            int j = (int) (Math.random() * 4);
            switch (j) {
                case 1:
                    int bX = (int) (Math.random() * (57-48) + 48);
                    byteArrayOutputStream.write(bX);
                    countX = true;
                    break;
                case 2:
                    int bY = (int) (Math.random() * (90-65) + 65);
                    byteArrayOutputStream.write(bY);
                    countY = true;
                    break;
                case 3:
                    int bZ = (int) (Math.random() * (122-97) + 97);
                    byteArrayOutputStream.write(bZ);
                    countZ = true;
                    break;
            }
        }

        if (!countX || !countY || !countZ) {
            System.out.println(">-<0>--->>> " + "\u001B[35m" + byteArrayOutputStream + "\u001B[0m");
            return getPassword();
        } else if (data.contains(byteArrayOutputStream)) {
            System.out.println(">-<0><101>--->>> " + "\u001B[31m" + byteArrayOutputStream + "\u001B[0m");
            return getPassword();
        } else {
            return byteArrayOutputStream;
        }
    }
}

