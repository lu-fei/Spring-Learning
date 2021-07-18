package com.yr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {

    @RequestMapping(value = "/t2")
    public String getValue(Model model){
        model.addAttribute("msg", "ControllerTest2");
        return "showTime";
    }
}
