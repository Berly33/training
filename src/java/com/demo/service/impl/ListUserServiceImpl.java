package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.dao.impl.UserDaoImpl;
import com.demo.entity.User;
import com.demo.service.ListUserService;

import java.util.List;

public class ListUserServiceImpl implements ListUserService {
    private UserDao userDao = new UserDaoImpl();
    public List<User> getalluser() {
        try {
            return userDao.getalluser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
