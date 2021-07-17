package com.yr.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 这里我们先实现 Controller 接口，后面可以直接使用注解配置
public class HelloController4 implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        // ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();

        // 封装对象，放在 ModelAndView 中
        String result = "Hello World! Hello SpringMVC-04!";  // 假定这个是我们从业务层获取的结果
        mv.addObject("msg", result);

        // 封装要跳转的视图，放在 ModelAndView 中
        mv.setViewName("helloController4");      // /WEB-INF/jsp/helloController4.jsp

        // 返回 MV
        return mv;
    }
}