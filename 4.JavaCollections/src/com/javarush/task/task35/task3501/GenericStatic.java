package com.javarush.task.task35.task3501;

public class GenericStatic {
    public static <Object> Object someStaticMethod(Object genericObject) {
        System.out.println(genericObject);
        System.out.println(genericObject.getClass().getName());
        return genericObject;
    }
}
