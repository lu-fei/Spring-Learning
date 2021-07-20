package com.yr.controller;

import com.yr.pojo.Books;
import com.yr.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "book")
public class HelloController {

    // controller 层调 service 层

    /* @Autowired 是一个注释，它可以对类成员变量、方法及构造函数进行标注，让 spring 完成 bean 自动装配的工作。
        @Autowired 默认是按照类去匹配，配合 @Qualifier 指定按照名称去装配 bean。*/
    @Autowired
    // @Qualifier注解的用处：当一个接口有多个实现的时候，为了指名具体调用哪个类的实现(这里的value要对应在spring-mvc.xml中注册的bean)
    @Qualifier(value = "bookServiceImpl")
    private BookService bookService;

    // 查询全部的书籍，并返回到一个书籍展示页面
    @RequestMapping(value = "/allBook")
    public String selectAllBooks(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

}
