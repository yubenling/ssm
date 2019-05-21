package com.springboot.service;

import com.springboot.domain.User;
import com.springboot.entity.JpaUser;

import java.util.List;

/*
 *@create yubenling
 *@date  2019/5/19
 *@desc  */
public interface UserService {
    List<User> getUserList();

    JpaUser getUser();
}
