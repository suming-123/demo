package com.example.springbootdemo.controller;

import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * Description TODO
 * @Auto 吴鹏
 * @Date 2020/2/1114:56
 * @Version 1.0
 **/
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/queryAll")
    public List<User> queryAll(){
        return userService.queryAll();
    }
}
