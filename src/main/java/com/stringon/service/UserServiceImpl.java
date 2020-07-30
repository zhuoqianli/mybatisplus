package com.stringon.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stringon.dao.UserDao;
import com.stringon.entity.User;
import org.springframework.stereotype.Service;

@Service("userService")
@Transactionl
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
