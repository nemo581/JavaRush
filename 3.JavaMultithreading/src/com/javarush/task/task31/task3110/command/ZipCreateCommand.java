package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;
import com.javarush.task.task31.task3110.exception.PathIsNotFoundException;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipCreateCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            getZipFileManager().createZip(Paths.get(ConsoleHelper.readString()));
            ConsoleHelper.writeMessage("Архив создан.");
        } catch (PathIsNotFoundException p) {
            ConsoleHelper.writeMessage("Вы неверно указали имя файла или директории.");
        }
    }
}