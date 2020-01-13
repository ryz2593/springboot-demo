package cn.itcast.mapper;


import cn.itcast.pojo.User;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author ryz2593
 * @date 2020/1/13 17:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;


    @Test
    public void testInsert() {
        User user = new User();
        user.setUserName("zhangsan");
        user.setName("张三");
        user.setAge(20);
        user.setPassword("123456");
        user.setSex(1);
        userMapper.insert(user);
    }

    @Test
    public void testQuery() {
        User user = userMapper.selectByPrimaryKey(2L);
        System.out.println("user = " + user);
    }

}