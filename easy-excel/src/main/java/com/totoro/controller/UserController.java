package com.totoro.controller;

import com.totoro.mapper.UserMapper;
import com.totoro.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:totoro
 * @createDate:2022/11/25
 * @description:
 */
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("export")
    public List<?> export(){
        List<User> users = userMapper.limitUser();
        return users;
    }
}
