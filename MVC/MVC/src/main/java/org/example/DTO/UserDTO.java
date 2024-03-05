package org.example.DTO;

import org.example.Model.UserModel;

public class UserDTO {

    private String name;
    private String email;

    public UserDTO(UserModel userModel){
        this.name = userModel.getName();
        this.email = userModel.getEmail();
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
