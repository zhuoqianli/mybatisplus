package com.stringon;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.stringon.dao.ManagerDao;
import com.stringon.entity.Manager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ManagerTest {

    @Resource
    private ManagerDao managerDao;

    @Test
    public void test1() {
        QueryWrapper<Manager> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 1);
        List<Manager> managers = managerDao.selectList(wrapper);
        managers.forEach(System.out::print);
    }

}
