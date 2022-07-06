package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {


    public static ImageReader getImageReader(ImageTypes types) {
        ImageReader read = null;

        if (types == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        } else {
            switch (types) {
                case BMP:
                    BmpReader readB = new BmpReader();
                    return readB;
                case JPG:
                    JpgReader readJ = new JpgReader();
                    return readJ;
                case PNG:
                    PngReader readP = new PngReader();
                    return readP;
            }
        }

        return read;
    }
}
