package com.hzwq.zeusauth.controller;

import com.hzwq.zeusauth.dao.UserMapper;
import com.hzwq.zeusauth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/getAllUser")
    @ResponseBody
    public User getAllUser(){
        return userMapper.getAllUser();
    }
}
