package com.springboot.controller;

import com.springboot.entity.JpaUser;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *@create yubenling
 *@date  2019/5/19
 *@desc  */
@RestController
public class JpaController {


    @Autowired
    private UserService userService;

    @RequestMapping("jpa")
    public JpaUser getUser(){
        JpaUser su=  userService.getUser();
        System.out.println(su);
      return    userService.getUser();
    }
}
