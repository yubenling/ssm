package com.springboot.serviceimpl;

/*
 *@create yubenling
 *@date  2019/5/19
 *@desc  */

import com.springboot.Jpadao.Jpadao;
import com.springboot.domain.User;
import com.springboot.entity.JpaUser;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIml implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private Jpadao jpadao;

    @Autowired
    public JpaUser getUser(){
       return jpadao.getOne(1);
    }

   @Override
   public List<User> getUserList(){

       jdbcTemplate.update("insert into userinfo (name ,age ) values (?,?)","yubenling","18");

       System.out.println("--------------------------");
        return  null;
  }

}
