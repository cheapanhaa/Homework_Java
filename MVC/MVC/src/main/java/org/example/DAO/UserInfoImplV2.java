package org.example.DAO;

import org.example.Model.UserModel;

public class UserInfoImplV2 implements UserInfoDAO{
    private UserModel userModel;
    @Override
    public void insertData(UserModel userModel) {
        userModel.setName("Change Name");
        this.userModel = userModel;
    }

    @Override
    public UserModel getData() {
        this.userModel.setEmail("newemail@gmail.com");
        return userModel;
    }
}
