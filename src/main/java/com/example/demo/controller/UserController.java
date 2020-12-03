package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理 Controller
 * @author zero
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("")
    public String index() {
      return "hello user";
    }

    @RequestMapping("/queryUserById")
    public User selectUserById(int id) {
        System.out.println("id:" + id);
        return userService.selectByPrimaryKey(id);
    }

}