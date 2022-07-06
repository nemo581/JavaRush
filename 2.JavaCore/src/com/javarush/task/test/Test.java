package com.javarush.task.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.*;
import java.util.List;

public class Test extends SimpleFileVisitor<Path> {
    public static void main(String[] args) throws IOException {
        String urlPath = "https://pacemook.com/photos/image1.jpg";
        Path pathFileSave = Paths.get("C:/Users/AlRezn/Desktop/tempDFiles");


        String fileName = urlPath.substring(urlPath.lastIndexOf("/"));
        Path download = pathFileSave.resolve(fileName.substring(1));


        System.out.println(download);



//        Path path1 = tempFile.toAbsolutePath();
//        Path path2 = Paths.get("C:/Users/AlRezn/Desktop/tempDFiles/1.txt");
//        Files.move(path1, path2);



    }
}
