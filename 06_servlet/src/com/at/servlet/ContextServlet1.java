package com.at.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();

        System.out.println("保存之前context1 中获取域数据k1的值是："+ servletContext.getAttribute("k1"));

        servletContext.setAttribute("k1","v1");
        System.out.println("context1 中获取域数据k1的值是："+ servletContext.getAttribute("k1"));
        System.out.println("context1 中获取域数据k1的值是："+ servletContext.getAttribute("k1"));
        System.out.println("context1 中获取域数据k1的值是："+ servletContext.getAttribute("k1"));
        System.out.println("context1 中获取域数据k1的值是："+ servletContext.getAttribute("k1"));

    }
}
