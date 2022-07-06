package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));

        while (fileReader.ready()) {
            String[] line = fileReader.readLine().split("\\s");
            String name = "";
            String birthday = "";
            for (int i = 0; i < line.length; i++) {
                if (i < line.length - 3) {
                    name = name + line[i] + " ";
                }
                else {
                    birthday = birthday + line[i] + " ";
                }
            }
            Date date = null;
            try {
                date = new SimpleDateFormat("dd MM yyyy").parse(birthday.trim());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Person person = new Person(name.trim(), date);
            PEOPLE.add(person);
        }
        fileReader.close();
    }
}
