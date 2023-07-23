package com.example.demo;

import com.example.demo.mapper.OrderSplitTableMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.UserSplitTableMapper;
import com.example.demo.pojo.Order;
import com.example.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.lang.reflect.Method;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserSplitTableMapper userSplitTableMapper;

    @Resource
    private OrderSplitTableMapper orderSplitTableMapper;

    @Test
    void contextLoads() throws NoSuchMethodException, ClassNotFoundException {

        Order order = new Order();
        order.setId(1);
        order.setName("小吕");
        orderSplitTableMapper.insertOrder(order);
    }

}
