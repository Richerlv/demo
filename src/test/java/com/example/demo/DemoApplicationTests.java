package com.example.demo;

import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.UserSplitTableMapper;
import com.example.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserSplitTableMapper userSplitTableMapper;

    @Test
    void contextLoads() {
        User user = new User();
        user.setName("lll");
        user.setPassword("123");
        System.out.println(userSplitTableMapper.insertUser(user));
    }

}
