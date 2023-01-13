package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
    private final ModelData modelData = new ModelData();

    @Override
    public void loadUsers() {
        String userName;
        List<User> addNewUsers = new ArrayList<>();
        for (int i = 0; i < 600; i++) {
            userName = "UserName_#" + i;
            addNewUsers.add(new User(userName, i, 1));
        }
        modelData.setUsers(addNewUsers);
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }
}