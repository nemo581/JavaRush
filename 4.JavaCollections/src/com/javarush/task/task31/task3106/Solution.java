package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.*;
import java.util.zip.ZipInputStream;
/* 
Разархивируем файл
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        List<String> list = new ArrayList<>(Arrays.asList(args).subList(1, args.length));
        Collections.sort(list);

        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        for (String s : list) {
            FileInputStream inputStream = new FileInputStream(s);
            byte[] buf = new byte[inputStream.available()];
            inputStream.read(buf);
            byteArray.write(buf);
            inputStream.close();
        }
        ZipInputStream in = new ZipInputStream(new ByteArrayInputStream(byteArray.toByteArray()));
        FileOutputStream out = new FileOutputStream(file);
        if (in.getNextEntry() != null) {
            int len;
            byte[] buffer = new byte[2048];
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            out.close();
        }
        in.close();
    }
}
