package com.javarush.task.task35.task3507;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoadingClass extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) {
        byte[] bytes = new byte[0];
        try {
            bytes = loadClassFromFile(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return defineClass(null, bytes, 0, bytes.length);
    }

    private byte[] loadClassFromFile(String filename) throws IOException {
//        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);
        InputStream inputStream = Files.newInputStream(Paths.get(filename));
        byte[] buffer;
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int nextValue = 0;
        while ((nextValue = inputStream.read()) != -1) {
            byteStream.write(nextValue);
        }
        buffer = byteStream.toByteArray();
        inputStream.close();
        return buffer;
    }
}
