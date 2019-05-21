package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *@create yubenling
 *@date  2019/5/19
 *@desc  */
@Controller
public class ThymeleafController {

    @RequestMapping("test")
    public  String  getPath(Model model){

        return  "freemarker";
    }
}

