package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 *@create yubenling
 *@date  2019/5/19
 *@desc jpauser
 * */
@Entity(name="userinfo")
public class JpaUser {
    @Id
    @GeneratedValue
    private  Integer id;
    @Column
    private String name;
    @Column
    private String age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JpaUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
