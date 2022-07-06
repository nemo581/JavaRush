package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {


    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String firstName;
            String middleName;
            String lastName;
            Date birthDate = null;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] bytes = line.split("\\s");
                firstName = bytes[1];
                lastName = bytes[0];
                middleName = bytes[2];
                SimpleDateFormat sdf = new SimpleDateFormat("d M y");
                try {
                    birthDate = sdf.parse(bytes[3] + " " + bytes[4] + " " + bytes[5]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                return new Person(firstName, middleName, lastName, birthDate);
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
