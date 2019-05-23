package com.springboot.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 *@create yubenling
 *@date  2019/5/20
 *@desc  使用本领1修改
 * */
@Component
@ConfigurationProperties(prefix = "connection")
@EnableConfigurationProperties(Connection.class)
public class Connection {


    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
