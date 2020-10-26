package com.at.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class ParameterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("==============dopost======================");
        //设置请求体的字符集为utf-8，从而解决post请求的中文乱码问题
        //必须在获取请求参数之前调用才有效
        request.setCharacterEncoding("utf-8");

        //获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String hobby = request.getParameter("hobby");
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("hobby: " + Arrays.asList(hobbies));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("==============doget======================");
        //设置请求体的字符集为utf-8，从而解决post请求的中文乱码问题
        //必须在获取请求参数之前调用才有效
        //request.setCharacterEncoding("utf-8");

        //获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String hobby = request.getParameter("hobby");
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("hobby: " + Arrays.asList(hobbies));

    }


}
