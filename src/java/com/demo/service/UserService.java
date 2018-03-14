package com.demo.service;

import com.demo.entity.User;

public interface UserService {
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
