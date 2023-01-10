package com.javarush.task.task36.task3606;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Осваиваем ClassLoader и Reflection
*/

public class Solution extends ClassLoader {
    private List<Class> hiddenClasses = new ArrayList<>();
    private String packageName;

    public Solution(String packageName) {
        this.packageName = packageName;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Solution solution = new Solution(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "com/javarush/task/task36/task3606/data/second");
        solution.scanFileSystem();
        System.out.println(solution.getHiddenClassObjectByKey("secondhiddenclassimpl"));
        System.out.println(solution.getHiddenClassObjectByKey("firsthiddenclassimpl"));
        System.out.println(solution.getHiddenClassObjectByKey("packa"));
    }

    public void scanFileSystem() throws ClassNotFoundException {
        File dir = new File(packageName);
        ClassLoader classLoader = Solution.class.getClassLoader();
        for (String fileName : dir.list()) {
            if (fileName.endsWith(".class")) {
                String className = packageName.replaceAll("[/\\\\]", ".").substring(packageName.lastIndexOf("ru/")) + "." + fileName.substring(0, fileName.length() - 6);
                Class<?> aClass = classLoader.loadClass(className);
                hiddenClasses.add(aClass);
            }
        }
    }

    public HiddenClass getHiddenClassObjectByKey(String key) {
        String lowerKey = key.toLowerCase();
        try {
            Class resultClass = null;
            for (Class aClass : hiddenClasses) {
                if (aClass.getSimpleName().toLowerCase().startsWith(lowerKey)) {
                    resultClass = aClass;
                    Constructor<?> declaredConstructor = resultClass.getDeclaredConstructor();
                    declaredConstructor.setAccessible(true);
                    return (HiddenClass) declaredConstructor.newInstance();
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b;
        Path path = Paths.get(name);
        String classPac = "com.javarush.task.task36.task3606.data.second." + path.getFileName().toString().substring(0, path.getFileName().toString().lastIndexOf("."));
        try {
            b = Files.readAllBytes(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return defineClass(classPac, b, 0, b.length);
    }
}