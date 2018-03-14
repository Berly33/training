package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.dao.impl.UserDaoImpl;
import com.demo.entity.User;
import com.demo.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao= new UserDaoImpl();

    public User login(User user) {

        String password = user.getPassword();
        user.setPassword(password);

        return userDao.login(user);
    }

    public void resign() {

    }

}
