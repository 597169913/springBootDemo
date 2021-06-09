package com.example.demo.service;

import com.example.demo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService  {
//    UserModel findUserModelByName(String name);
    UserModel getUserById(String id);

    UserModel getUserByName(String Name);

    UserModel save(UserModel record);

//    UserModel update(UserModel record);

    void delete(String id);

}
