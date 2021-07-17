package com.yr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * 之前我们写完这个类，要让它实现 Controller接口，然后重写里面的handleRequest 方法
 * 该方法最后返回一个 ModelAndView 对象，里面封装了我们填写的信息，并跳转了一个视图
 * 现在我们使用注解开发， ModelAndView对象是别人给我们的，我们只在里面封装对象，最终返回一个String，即跳转的页面
 * */
@Controller
public class HelloController5 {

    /*1. 如果我们在方法上加上一个 @RequestMapping("/Controller"),
    *   最终url显示: http//localhost:8080/项目名称(ApplicationContext)/Controller/hello5;
    * 2. 如果不加，url: http//localhost:8080/项目名称(ApplicationContext)/hello5
    * */
    @RequestMapping("/hello5")
    public String jumpUrl1(ModelAndView mv){
        // 封装我们要填写的信息
        mv.addObject("msg", "Hello World! Hello springMVC-05-annotation");

        // 这个hello5就是我们要去跳转的页面
        return "hello5";
    }
}



