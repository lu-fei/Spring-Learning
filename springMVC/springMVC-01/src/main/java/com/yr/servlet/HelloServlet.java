package com.yr.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.获取前端参数
        String method = req.getParameter("method");
        if(method.equals("add")){
            req.getSession().setAttribute("msg", "执行了add方法");
        }
        if(method.equals("delete")){
            req.getSession().setAttribute("msg", "执行了delete方法");
        }
        // 2.调用业务层
        // 3.视图转发或重定向
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = a + b + c;
        int e = c + d;
        int f = d + e;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}

