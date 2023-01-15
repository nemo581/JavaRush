package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
    private final ModelData modelData = new ModelData();
    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> loadingUsers = new ArrayList<>();
        String userName;
        for (int i = 0; i < 3; i++) {
            userName = "UserName_#" + i;
            loadingUsers.add(new User(userName, i, 1));
        }
        modelData.setUsers(loadingUsers);
    }
}
