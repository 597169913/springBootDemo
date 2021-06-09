package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(path = "/rest/user")
public class UserController {
  @Resource
  private UserService userService;

  @GetMapping("/{id}")
  public UserModel getUserById(@PathVariable("id") String id) {
    return userService.getUserById(id);
  }
  @GetMapping("/getUserByName")
  public UserModel getUserByName(String name) {
    return userService.getUserByName(name);
  }

  @PostMapping("/add")
  public  UserModel save(@RequestBody UserModel record) {
    return userService.save(record);
  }

  @GetMapping("/delete/{id}")
  public void delete(@PathVariable("id") String id) {
    userService.delete(id);
  }

  @GetMapping("/userList")
  public List<UserModel> getAll() {return UserService.findAll();}
}
