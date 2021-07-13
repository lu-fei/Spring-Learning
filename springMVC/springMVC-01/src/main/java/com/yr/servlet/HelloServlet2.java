package com.yr.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter writer = resp.getWriter();
//        writer.print("Hello World! Hello SpringMVC_01_HelloServlet2");

        // 响应的类型：html
        resp.setContentType("text/html");
        // 获取响应的输出流
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World! HelloServletGG</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World Hello Servlet!</h1>");
        out.println("<h1>SpringMVC-01-HelloServlet2!</h1>");
        out.println("</body>");
        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
