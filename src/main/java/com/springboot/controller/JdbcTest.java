package com.springboot.controller;

import com.springboot.domain.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *@create yubenling
 *@date  2019/5/19
 *@desc  */
@RestController
public class JdbcTest {

    //配置数据源后，jdbctemplate直接就配置进spring容器
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserService userService;

    @RequestMapping("getUserList")
    public List<User> getUserList(){

        return userService.getUserList();
    }
}
