package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public UserModel getUserById(String id) {
        return userDao.findById(id).get();
    }
    @Override
    public  UserModel getUserByName(String name) {
        return userDao.findByName(name);
    }
    @Override
    public UserModel save(UserModel record) {
        return userDao.save(record);
    }

    @Override
    public void delete(String id) {
        userDao.deleteById(id);
    }
    public List<UserModel> findAll() {
        return userDao.findAll();
    }
}
