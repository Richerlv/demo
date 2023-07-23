package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Richerlv
 * @date: 2023/7/23 16:06
 * @description:
 */
@Mapper
public interface UserMapper {

    User selectById(int id);

    int updateById(User user);

    int insertUser(User user);

    int deleteById(int id);

}
