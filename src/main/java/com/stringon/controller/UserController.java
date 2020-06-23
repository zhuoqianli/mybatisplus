package com.stringon.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.stringon.entity.User;
import com.stringon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getById")
    public Object getById() {
        // BaseMapper<User> baseMapper = UserService.getBaseMapper();
        User byId = userService.getById('1');
        List<User> users = userService.list(new QueryWrapper<User>().ge("uid", 1));
        return users;
    }
}
