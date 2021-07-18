package com.yr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    @RequestMapping("/getSum/{a}/{b}")
    public String getSum(@PathVariable int a, @PathVariable int b, Model model){
        int sum = a + b;
        model.addAttribute("msg", "result = " + sum);
        return "sum";
    }

    @RequestMapping(value = "/getSum2")
    public String getSum2(int a, int b, Model model){
        int sum = a + b;
        model.addAttribute("msg", "result = " + sum);
        return "sum";
    }


    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public String post(Model model){
        model.addAttribute("msg", "must post");
        return "sum";
    }

    @RequestMapping("/showVal")
    public String showVal(Model model){
        model.addAttribute("msg", "showVal");
        return "sum";
    }
}
