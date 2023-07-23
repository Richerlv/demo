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
@DBRouter
@DBRouterStrategy(splitTable = true)
public interface UserSplitTableMapper {

    User selectById(int id);

    int updateById(User user);

    int insertUser(User user);

    int deleteById(int id);
}
