package com.at.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求的参数
        String username = request.getParameter("username");
        System.out.println("servlet2查看servlet1中的参数： " + username);

        //查看servlet1是否有盖章
        Object key1 = request.getAttribute("key1");
        System.out.println("servlet1是否有盖章" + key1);

        //处理自己的业务
        System.out.println("servlet2 处理自己的业务");


    }
}
