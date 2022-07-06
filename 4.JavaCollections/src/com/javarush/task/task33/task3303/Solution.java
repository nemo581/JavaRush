package com.javarush.task.task33.task3303;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* 
Десериализация JSON объекта
*/

public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
//        StringBuilder stringBuilder = new StringBuilder();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            stringBuilder.append(line);
//        }
//        reader.close();

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(fileName),clazz);
    }

    public static void main(String[] args) throws IOException {
        convertFromJsonToNormal("C:\\JresAourVcesA\\1.json", Cat.class);

    }
}
class Cat {
    public String name;
    public String owner;
    public int age;
    public ArrayList<Cat> pets = new ArrayList<>();
}


