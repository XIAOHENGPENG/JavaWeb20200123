package com.at.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //给客户端回传一个报文

        //设置字符集，必须在response获取字节流/字符流之前设置才生效
        System.out.println("设置之前的response字符集：" + response.getCharacterEncoding()); //默认：ISO-8859-1 不支持中文
        //设置response字符集
        //response.setCharacterEncoding("UTF-8");//此处设置的服务器的字符集，若客户端的字符集不是utf-8还是会乱码
        //System.out.println("设置之后的response字符集：" + response.getCharacterEncoding());

        //01 通过响应头，设置浏览器也使用utf-8字符集
        //response.setHeader("Content-Type","text/html; charset=UTF-8");

        //02 同时设置服务器和客户端都使用utf-8字符集，此方法一定要在获取流对象之前才有效
        response.setContentType("text/html; charset=UTF-8");
        System.out.println("设置之后的response字符集：" + response.getCharacterEncoding());


        //字节流和字符流只能用一个，否则会报错：java.lang.IllegalStateException: getWriter() has already been called for this response
        PrintWriter writer = response.getWriter();
        //writer.write("response's content!");
        writer.write("国哥很帅！！！");

        //response.getOutputStream();

    }
}
