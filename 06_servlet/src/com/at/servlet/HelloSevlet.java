package com.at.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloSevlet implements Servlet {

    //构造器
    public HelloSevlet() {
        System.out.println("1.构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.初始化方法");

        //1.可以获取servlet程序的别名servlet-name的值
        System.out.println("HelloServlet程序的别名是：" + servletConfig.getServletName());
        //2.获取初始化参数init-parameter
        System.out.println(servletConfig.getInitParameter("username"));
        System.out.println(servletConfig.getInitParameter("url"));
        System.out.println("**********************************");
        //3.获取servletContext对象
        System.out.println(servletConfig.getServletContext());


    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 说明：处理请求和响应的方法
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3.servlet 被访问了！！！");  //当web.xml中url-pattern被访问，即：http://localhost:8080/06_servlet/hello，就会打印
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        System.out.println(method);
        if("GET".equals(method)){
            doGet();
        } else if ("POST".equals(method)) {
            doPost();
        }

    }

    public void doGet() {
        System.out.println("GET请求");
    }

    public void doPost() {
        System.out.println("POST请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.销毁方法");

    }
}
