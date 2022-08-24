package com.javarush.task.task35.task3507;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
ClassLoader - что это такое?
*/

public class Solution {
    public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        Set<? extends Animal> allAnimals = getAllAnimals(Solution.class.getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath() + Solution.class
                .getPackage()
                .getName()
                .replaceAll("[.]", "/") + "/data");
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) {
        Set<Animal> result = new HashSet<>();
        File dir = new File(pathToAnimals);
        for (File f : Objects.requireNonNull(dir.listFiles())) {
            if (f.isFile() && f.getName().endsWith(".class")) {
                LoadingClass loadingClass = new LoadingClass();
                Class<?> clazz = loadingClass.findClass(pathToAnimals + "/" + f.getName());
                if (clazz.getInterfaces().length > 0) {
                    for (Class<?> s : clazz.getInterfaces()) {
                        if (s.getSimpleName().equals("Animal")) {
                            if (clazz.getConstructors().length > 0) {
                                for (Constructor<?> c : clazz.getConstructors()) {
                                    if (c.getParameterCount() == 0) {
                                        try {
                                            Animal o = (Animal) clazz.newInstance();
                                            result.add(o);
                                        } catch (InstantiationException | IllegalAccessException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
