package com.demo.servlet;

import com.demo.entity.User;
import com.demo.service.UserService;
import com.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

        @WebServlet(name = "SelectServlet",urlPatterns = "/SelectServlet")
public class SelectServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user= (User) request.getSession().getAttribute("user");
        int id = user.getId();
        try {
           User user1  =  userService.select(id);
            System.out.println("通过session查询用户信息");
            System.out.println(user1.getId());
            System.out.println(user1.getUsername());
            System.out.println(user1.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
