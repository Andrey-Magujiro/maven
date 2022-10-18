package com.andreev.web.servlet;

import com.andreev.service.service.UserService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.function.Supplier;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    private final UserService us = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res){
        us.getUser(1L);
    }
}
