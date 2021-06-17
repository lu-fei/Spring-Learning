package com.yr.dao;

import com.yr.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    // 查询
    List<User> selectUsers();

    // 添加
    void add(User user);

    // 删除
    void delete(@Param("id") int id);
}
