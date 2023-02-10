package com.javarush.task.task30.task3008.client;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ClientGuiModel {
    private final Set<String> allUserNames = new ConcurrentSkipListSet<>();
    private String newMessage;

    public Set<String> getAllUserNames() {
        return allUserNames;
    }

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    public synchronized void addUser(String newUserName) {
        allUserNames.add(newUserName);
    }

    public synchronized void deleteUser(String userName) {
        allUserNames.remove(userName);
    }
}
