package com.stringon.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.stringon.dao.ManagerDao;
import com.stringon.entity.CodeEnum;
import com.stringon.entity.Manager;
import com.stringon.entity.RepData;
import com.stringon.entity.User;
import com.stringon.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@Validated
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private ManagerDao managerDao;
    @RequestMapping(value = "/getById", produces = "application/json;charset=UTF-8")
    public Object getById(@NotNull(message = "不允许为空") String cname, @NotNull(message = "年龄不为空") Integer age) {
        // BaseMapper<User> baseMapper = UserService.getBaseMapper();
        User byId = userService.getById('1');
        List<User> users = userService.list(new QueryWrapper<User>().ge("id", 1));
        RepData<List> data = new RepData<List>();
        // return data.info(CodeEnum.SUCCESS, users);
        return data.info(CodeEnum.SUCCESS, managerDao.selectList(new QueryWrapper<Manager>().ge("id",1)));
    }
}
