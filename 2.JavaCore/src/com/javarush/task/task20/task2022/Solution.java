package com.javarush.task.task20.task2022;
import java.io.*;
/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(this.fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution= new Solution("1.txt");
        solution.writeObject("Hello Stream");

        FileOutputStream saveSolution = new FileOutputStream("saveSolution.bin");
        ObjectOutputStream saveObject = new ObjectOutputStream(saveSolution);
        saveObject.writeObject(solution);
        saveSolution.close();
        saveObject.close();

        FileInputStream fileInput = new FileInputStream("saveSolution.bin");
        ObjectInputStream loadObject = new ObjectInputStream(fileInput);
        Object object = loadObject.readObject();
        fileInput.close();
        loadObject.close();

        Solution loadSolution = (Solution) object;
        System.out.println(loadSolution.stream + " " + loadSolution.fileName);
    }
}
