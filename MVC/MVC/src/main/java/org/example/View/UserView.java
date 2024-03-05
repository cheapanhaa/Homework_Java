package org.example.View;

import org.example.Model.UserModel;

import java.util.Scanner;

public class UserView {
    public UserModel insertData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your Name: ");
        String name = scanner.nextLine();
        System.out.println("Input Email: ");
        String email = scanner.nextLine();
        System.out.println("Input Password: ");
        String password = scanner.nextLine();
        return new UserModel(name, email, password);
    }
}
