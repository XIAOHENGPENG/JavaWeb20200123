package com.at.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求转发
 */
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求的参数
        String username = request.getParameter("username");
        System.out.println("servlet1中的参数： " + username);

        //给材料盖章
        request.setAttribute("key1", "servlet1的章");

        //请求转发：必须以“/”打头，斜杠表示地址为：http://ip:port/工程名/，映射到IDEA代码的web目录
        //RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet2");

        //通过请求转发访问WEB-INF下的内容
        RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("/WEB-INF/form.html");

        //请求转发是否可以访问工程外的内容？  不能

        //请求转发目的地
        //requestDispatcher.forward(request,response);
        requestDispatcher1.forward(request,response);

    }
}
