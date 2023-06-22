package com.javarush.task.task32.task3209;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        String extension = f.getName().substring(f.getName().lastIndexOf(".")).toLowerCase();
        return f.isDirectory() || extension.equals(".html") || extension.equals(".htm");
    }

    @Override
    public String getDescription() {
        return "HTML и HTM файлы";
    }
}