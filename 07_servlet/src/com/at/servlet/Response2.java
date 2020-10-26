package com.at.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("response2");
        //不能共享request域中的数据，原因：每次请求都会封装成一个request域对象，此处是两个不同的request域对象
        System.out.println(request.getAttribute("key1"));
        response.getWriter().write("response2's result!");

    }
}
