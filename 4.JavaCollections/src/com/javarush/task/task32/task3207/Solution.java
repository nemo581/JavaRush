package com.javarush.task.task32.task3207;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/* 
К серверу по RMI
*/

public class Solution {
    public static final String UNIC_BINDING_NAME = "double.string";
    public static Registry registry;
    // Pretend we're starting an RMI client as the CLIENT_THREAD thread
    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            // My code
            try {
                DoubleString servise = (DoubleString) registry.lookup(UNIC_BINDING_NAME);
                String result = servise.doubleString("Home sweet home.");
                System.out.println(result);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            }
            // My code End
        }
    });
    public static void main(String[] args) {
        // Pretend we're starting an RMI server as the main thread
        Remote stub = null;
        try {

            // реестр расшареных объектов
            registry = LocateRegistry.createRegistry(2099);

            //Объект для удаленного доступа
            final DoubleStringImpl service = new DoubleStringImpl();

            // "Заглушка" - приемник удаленных вызовов
            stub = UnicastRemoteObject.exportObject(service, 0);

            // регистрация заглушки
            registry.bind(UNIC_BINDING_NAME, stub);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

        // Start the client
        CLIENT_THREAD.start();
    }
}
