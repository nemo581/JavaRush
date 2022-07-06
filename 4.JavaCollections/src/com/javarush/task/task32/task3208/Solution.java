package com.javarush.task.task32.task3208;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/* 
RMI-2
*/

public class Solution {
    public static Registry registry;
    public static final String UNIC_BINDING_NAME = "server.connect";

    // Pretend we're starting an RMI client as the CLIENT_THREAD thread
    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                for (String bindingName : registry.list()) {
                    Animal service = (Animal) registry.lookup(bindingName);
                    service.printName();
                    service.speak();
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            }
        }
    });

    // Pretend we're starting an RMI server as the SERVER_THREAD thread
    public static Thread SERVER_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            //напишите тут ваш код
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }

            try {
                registry = LocateRegistry.createRegistry(2099);
                final Cat cat = new Cat("Barsik");
                final Dog dog = new Dog("Sharik");
                Remote catStub = UnicastRemoteObject.exportObject((Remote) cat,0);
                Remote dogStub = UnicastRemoteObject.exportObject((Remote) dog,0);
                registry.bind(UNIC_BINDING_NAME, catStub);
                registry.bind(UNIC_BINDING_NAME, dogStub);
            } catch (AccessException e) {
                e.printStackTrace();
            } catch (AlreadyBoundException e) {
                e.printStackTrace();
            } catch (RemoteException remoteException) {
                remoteException.printStackTrace();
            }

        }
    });

    public static void main(String[] args) throws InterruptedException {
        // Starting an RMI server thread
        SERVER_THREAD.start();
        Thread.sleep(1000);
        // Start the client
        CLIENT_THREAD.start();
    }
}
