package org.example.DAO;

import org.example.Model.UserModel;

public interface UserInfoDAO {
    void insertData(UserModel userModel);
    UserModel getData();
}
