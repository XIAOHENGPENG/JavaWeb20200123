package com.at.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloSevlet2 extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        //super.init(config);  //这句必须保留，否则getServletConfig()会出现空指针异常的情况
        this.init(config);
        System.out.println("重写servlet初始化方法");
    }

    /**
     * 在get请求时候调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("helloServlet2 doGet");

        ServletConfig servletConfig = getServletConfig();
        //1.可以获取servlet程序的别名servlet-name的值
        System.out.println("HelloServlet程序的别名是：" + servletConfig.getServletName());
        //2.获取初始化参数init-parameter
        System.out.println(servletConfig.getInitParameter("username")); //这是HelloSevlet的web.xml参数，获取不到，只能获取自己对应的
        System.out.println(servletConfig.getInitParameter("url"));//这是HelloSevlet的web.xml参数，获取不到，只能获取自己对应的
        System.out.println("**********************************");

    }


    /**
     * 在post请求时候调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("helloServlet2 doPost");
    }
}
