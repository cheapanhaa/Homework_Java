package org.example.DAO;

import org.example.Model.UserModel;

public class UserInfoImplV1 implements UserInfoDAO{
    private UserModel userModel;
    @Override
    public void insertData(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public UserModel getData() {
        return this.userModel;
    }
}
