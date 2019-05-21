package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 *@create yubenling
 *@date  2019/5/19
 *@desc
 */
@SpringBootApplication
@EnableJpaRepositories("com.springboot.Jpadao")
@EntityScan("com.springboot.entity")
public class StartApp {


    public static void main(String[] args) {
        SpringApplication.run(StartApp.class,args);
    }


}
