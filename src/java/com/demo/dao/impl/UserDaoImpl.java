package com.demo.dao.impl;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import com.demo.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private Connection conn;
    private PreparedStatement preparedStatement ;
    private ResultSet resultSet;
    public User login(User user) {
        conn = JdbcUtil.getConnect();

        String sql = "select * from user where username = ? and password = ? ";

        User user1 = new User();

        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                user1.setId(resultSet.getInt(1));
                user1.setUsername(resultSet.getString(2));
                user1.setPassword(resultSet.getString(3));
            }
            return  user1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void register(User user) {
        try {
            conn = JdbcUtil.getConnect();
            String sql = "insert into user (username,password) values(?,?)";
            preparedStatement=conn.prepareStatement(sql);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JdbcUtil.close(preparedStatement, conn);
        }
    }

    public User select(int id)throws Exception {
        conn = JdbcUtil.getConnect();

        String sql = "select * from user where id = ? ";

        User user1 = new User();

        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                user1.setId(resultSet.getInt(1));
                user1.setUsername(resultSet.getString(2));
                user1.setPassword(resultSet.getString(3));
            }
            return  user1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> getalluser(){
        //获取连接
        conn = JdbcUtil.getConnect();
        //写一个sql语句
        String sql = "select * from user";
        //动态执行sql语句
        try {
            preparedStatement = conn.prepareStatement(sql);
            //添加结果集，保存查询出来的对象
            resultSet = preparedStatement.executeQuery();

            List<User> userList = new ArrayList<User>();

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setPassword(resultSet.getString("password"));
                user.setUsername(resultSet.getString("username"));

                userList.add(user);
            }
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
