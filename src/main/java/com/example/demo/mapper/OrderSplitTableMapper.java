package com.example.demo.mapper;

import com.example.demo.pojo.Order;
import com.example.demo.pojo.User;
import com.example.simplerouter.annotation.DBRouter;
import com.example.simplerouter.annotation.DBRouterStrategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Richerlv
 * @date: 2023/7/23 23:51
 * @description:
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface OrderSplitTableMapper {

    @DBRouter(key = "id")
    int insertOrder(Order order);

}
