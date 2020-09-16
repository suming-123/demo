package com.example.springbootdemo.service;

import com.example.springbootdemo.dao.UserDao;
import com.example.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * Description TODO
 * @Auto 吴鹏
 * @Date 2020/2/1114:52
 * @Version 1.0
 **/
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> queryAll(){
        return userDao.queryAll();
    }
}
