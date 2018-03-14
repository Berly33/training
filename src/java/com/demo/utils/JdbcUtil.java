package com.demo.utils;

import org.junit.Test;

import java.sql.*;

public class JdbcUtil {

    public static Connection getConnect() {
        //创建一个Connection变量
        Connection connection = null;

        try {
            //加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");

            //2.指定连接数据库的地址名称
            String url = "jdbc:mysql://192.168.1.120:3306/demo?useUnicode=true&characterEncoding=utf-8";
            //指定用户名和密码
            String user = "root";
            String passWord = "root";

            //3获取数据库连接
            connection= DriverManager.getConnection(url,user,passWord);
            //判断是否连接成功！
            if(null!=connection){
                System.out.println("数据库连接成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }

        return connection;
    }

    //关闭连接1
    public static void close(Statement stmt, Connection conn){
        try {
            stmt.close();
            conn.close();
            System.out.print("关闭成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //关闭连接2
    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.print("关闭成功");
    }

}
