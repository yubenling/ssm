package com.springboot.controller;
/*
 *@create yubenling
 *@date  2019/5/19
 *@desc
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {




    @RequestMapping("hello")
    public String testHellow(){
        return  "hellow";
    }
}