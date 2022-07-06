package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
*/
//  Charset.forName("CP866")
public class Solution {
    public static void main(String[] args) throws IOException {
        Map<ZipEntry, ByteArrayOutputStream> archive = new HashMap<>();
        Path filePath = Paths.get("C:\\Users\\AlRezn\\Desktop\\test\\Bryan Adams - Run To You.mp3");
        Path zipPath = Paths.get("C:\\Users\\AlRezn\\Desktop\\test\\test.zip");

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(String.valueOf(zipPath)))) {
            ZipEntry zipEntry;
            byte[] buffer = new byte[1024];
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                if (!zipEntry.isDirectory()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int length;
                    while ((length = zipInputStream.read(buffer)) > 0) {
                        byteArrayOutputStream.write(buffer, 0, length);
                    }
                    archive.put(zipEntry, byteArrayOutputStream);
                }
                zipInputStream.closeEntry();
            }
        }

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(String.valueOf(zipPath)))) {
            zipOutputStream.putNextEntry(new ZipEntry("new/" + filePath.getFileName()));
            Files.copy(filePath, zipOutputStream);
            zipOutputStream.closeEntry();

            for (Map.Entry<ZipEntry, ByteArrayOutputStream> entry : archive.entrySet()) {
                if (!entry.getKey().getName().contains(String.valueOf(filePath.getFileName()))) {
                    zipOutputStream.putNextEntry(new ZipEntry(entry.getKey().getName()));
                    zipOutputStream.write(entry.getValue().toByteArray(), 0, entry.getValue().size());
                    zipOutputStream.closeEntry();
                }
            }
        }
    }
}