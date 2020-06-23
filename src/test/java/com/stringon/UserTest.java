package com.stringon;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.stringon.dao.UserDao;
import com.stringon.entity.User;
import com.stringon.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Resource
    private UserDao userDao;
    @Resource
    private UserServiceImpl userService;
    @Test
    public void userOne() {
        List<String> strings = Arrays.asList("1", "2", "3");
        List<User> users = userDao.selectBatchIds(strings);
        users.forEach(System.out::println);
    }
    @Test
    public void queryByWarrpe1() {
        // 两种方式构建
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", "1")
                .or().lt("age",10 )
                .and(p -> p.eq("id","3" ).or().gt("salary", 100d));
        List<User> users = userDao.selectList(queryWrapper);
        HashMap<String, Object> hashMap = new HashMap<>();
        users.forEach(p -> hashMap.put(p.getName(),p ));
    }
}
