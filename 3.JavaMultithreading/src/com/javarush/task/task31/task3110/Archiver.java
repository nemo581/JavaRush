package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fullArchivePath = reader.readLine();
            ZipFileManager zipFileManager = new ZipFileManager(Paths.get(fullArchivePath));
            String fullEndPathOfTheArchive = reader.readLine();
            zipFileManager.createZip(Paths.get(fullEndPathOfTheArchive));
        }

        ExitCommand exitCommand = new ExitCommand();
        exitCommand.execute();
    }
}
