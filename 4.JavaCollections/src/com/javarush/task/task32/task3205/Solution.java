package com.javarush.task.task32.task3205;

import java.lang.reflect.Proxy;

/* 
Создание прокси-объекта
*/

public class Solution {
    public static void main(String[] args) {
        SomeInterfaceWithMethods obj = getProxy();
        obj.stringMethodWithoutArgs();
        obj.voidMethodWithIntArg(1);

        /* expected output
        stringMethodWithoutArgs in
        inside stringMethodWithoutArgs
        stringMethodWithoutArgs out
        voidMethodWithIntArg in
        inside voidMethodWithIntArg
        inside voidMethodWithoutArgs
        voidMethodWithIntArg out
        */
    }

    public static SomeInterfaceWithMethods getProxy() {
        SomeInterfaceWithMethodsImpl someInterfaceWithMethodsImpl = new SomeInterfaceWithMethodsImpl();
//        ClassLoader someClassLoader = someInterfaceWithMethodsImpl.getClass().getClassLoader();
//        Class[] interfaces = someInterfaceWithMethodsImpl.getClass().getInterfaces();
        SomeInterfaceWithMethods proxy = (SomeInterfaceWithMethods)Proxy.newProxyInstance(
                someInterfaceWithMethodsImpl.getClass().getClassLoader(),
                someInterfaceWithMethodsImpl.getClass().getInterfaces(),
                new CustomInvocationHandler(someInterfaceWithMethodsImpl));

        return proxy;
    }
}
