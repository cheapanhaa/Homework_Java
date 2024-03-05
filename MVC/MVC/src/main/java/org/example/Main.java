package org.example;

import org.example.DAO.UserInfoDAO;
import org.example.DAO.UserInfoImplV1;
import org.example.DAO.UserInfoImplV2;
import org.example.Model.UserModel;

public class Main {
    public static void main(String[] args) {
//        UserController userController = new UserController();
//        userController.insertData();
//        System.out.println("Get Data: ");
//        System.out.println(userController.getData());

//        UserModel userModel = new UserModel("NgichSeang", "seang@gmail.com", "123");
//        System.out.println(userModel);
//
//        UserDTO userDTO = new UserDTO(userModel);
//        System.out.println(userDTO);

//        UserController userController = new UserController();
//        userController.insertData();
//        System.out.println("Get Data: ");
//        System.out.println(userController.getData());

        UserInfoDAO userInfoDAO = new UserInfoImplV2();
        userInfoDAO.insertData(new UserModel("Lundy", "lundy@gmail.com", "123"));

        System.out.println(userInfoDAO.getData());
    }
}