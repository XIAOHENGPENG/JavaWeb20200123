package com.at.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("response1");

        request.setAttribute("key1","value1");

/*
        //第一种方法
        //设置响应状态码302 表示重定向
        response.setStatus(302);
        //设置响应头，说明新地址在哪里
       // response.setHeader("location","http://localhost:8080/07_servlet/response2");

        //浏览器不能直接访问WEB-INF下的内容
        //response.setHeader("location","http://localhost:8080/WEB-INF/form.html");

        //可以访问工程以外的资源
        response.setHeader("location","http://www.baidu.com");
*/

        //第二种方法(推荐使用）
        response.sendRedirect("http://www.baidu.com");




    }
}

