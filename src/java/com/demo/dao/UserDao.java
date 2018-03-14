package com.demo.dao;

import com.demo.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 登录
     * @return User
     */
    User login(User user);

    /**
     * 注册
     */
    void resign();

}
