package com.example.springbootdemo.domain;


import java.io.Serializable;


/**
 * @author suming
 * @description
 * @date 06/05/2019
 */
public class User implements Serializable {

    private Long userId;
    private String userName;
    private String name;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
