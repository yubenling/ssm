package com.springboot.Jpadao;

import com.springboot.entity.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 *@create yubenling
 *@date  2019/5/19
 *@desc  */
public interface Jpadao extends JpaRepository<JpaUser,Integer> {

}
