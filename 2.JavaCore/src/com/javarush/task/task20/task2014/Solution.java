package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutput = new FileOutputStream("saveSolution.dat");
        ObjectOutputStream saveObject = new ObjectOutputStream(fileOutput);
        Solution saveSolution = new Solution(10);
        saveObject.writeObject(saveSolution);
        fileOutput.close();
        saveObject.close();

        System.out.println(">>> " + new Solution(4));
        FileInputStream fileInput = new FileInputStream("saveSolution.dat");
        ObjectInputStream loadObject = new ObjectInputStream(fileInput);
        Object object = loadObject.readObject();
        fileInput.close();
        loadObject.close();

        Solution newSolution = (Solution) object;
        System.out.println(">>>> " + newSolution);
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
