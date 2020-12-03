package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

  /**
   * 用户注册
   * @param userName 用户名
   * @param password 密码
   * @return Result<User>
   */
  @PostMapping("/regist")
  public Result<User> regist(User user) {
    return userService.regist(user);
  }

  /**
   * 登录
   * @param userName 用户名
   * @param password 密码
   * @return Result<User>
   */
  @PostMapping(value = "/login")
  public Result<User> login(User user){
    return userService.login(user);
  }

}