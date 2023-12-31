package com.example.demo.mapper;

import com.example.demo.pojo.User;
import com.example.simplerouter.annotation.DBRouter;
import com.example.simplerouter.annotation.DBRouterStrategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Richerlv
 * @date: 2023/7/23 22:09
 * @description:
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface UserSplitTableMapper {

    @DBRouter(key = "id")
    User selectById(User user);

    @DBRouter(key = "id")
    int updateById(User user);

    @DBRouter(key = "id")
    int insertUser(User user);

    @DBRouter(key = "id")
    int deleteById(User user);
}
