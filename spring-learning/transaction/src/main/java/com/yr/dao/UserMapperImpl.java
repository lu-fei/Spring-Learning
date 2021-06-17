package com.yr.dao;

import com.yr.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUsers() {
        return getSqlSession().getMapper(UserMapper.class).selectUsers();
    }
}
