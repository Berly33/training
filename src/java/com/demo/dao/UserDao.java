package com.demo.dao;

import com.demo.entity.User;

import javax.jws.soap.SOAPBinding;
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
    void register(User user) throws Exception;

    User select(int id)throws Exception;

    List<User> getalluser() throws Exception;
}
