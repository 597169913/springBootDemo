package com.example.demo.dao;

import com.example.demo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<UserModel, String> {
    UserModel findByName(String name);
    List<UserModel> findAll();
}
