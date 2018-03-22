package com.demo.servlet;

import com.demo.entity.User;
import com.demo.service.ListUserService;
import com.demo.service.impl.ListUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListUserServlet",urlPatterns = "/ListUserServlet")
public class ListUserServlet extends HttpServlet {
    private ListUserService listUserService = new ListUserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取所有用户信息
        List<User> userList = listUserService.getalluser();
        request.getSession().setAttribute("userList", userList);
        request.getRequestDispatcher("allUser.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
