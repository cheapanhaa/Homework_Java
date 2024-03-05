package org.example.Controller;

import org.example.DTO.UserDTO;
import org.example.Model.UserModel;
import org.example.View.UserView;

public class UserController {
    private UserModel userModel;
    private UserView userView;


    public void insertData(){
        userView = new UserView();
        userModel = userView.insertData();
    }

    public UserDTO getData(){
        return new UserDTO(userModel);
    }
}
