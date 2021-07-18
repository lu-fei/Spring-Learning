package com.yr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ResultJump {

    // 方法1：通过HttpServletResponse 进行输出
    @RequestMapping(value = "/result/j1")
    public void jump1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().print("通过HttpServletResponse 进行输出");
    }

    // 方法2：通过HttpServletResponse实现重定向
    @RequestMapping(value = "/result/j2")
    public void jump2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/index.jsp");
    }

    // 方法3：通过HttpServletRequest实现转发
    @RequestMapping(value = "/result/j3")
    public void jump3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("msg", "/result/j3");
        request.getRequestDispatcher("/WEB-INF/jsp/target.jsp").forward(request, response);
    }

    @RequestMapping(value = "/t1")
    public String test(Model model){
        model.addAttribute("msg", "t1");
        return "target";
    }
}
