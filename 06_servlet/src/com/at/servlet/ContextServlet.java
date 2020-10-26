package com.at.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.获取web.xml中配置的上下文参数context-param
        //下面两种方法等价
        ServletContext servletContext = getServletConfig().getServletContext();
        ServletContext servletContext1 = getServletContext();
        if(servletContext==servletContext1) {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        }

        String password = servletContext.getInitParameter("password");
        System.out.println(password);

        //2.获取当前的工程路径，格式：/工程路径
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);

        //3.获取工程部署后台在服务器硬盘上的绝对路径
        System.out.println("工程部署的路径：" + servletContext.getRealPath("/"));

    }
}
