package com.yr.dao;

import com.yr.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUsers() {
        return getSqlSession().getMapper(UserMapper.class).selectUsers();
    }

    @Override
    public void add(User user) {
        getSqlSession().getMapper(UserMapper.class).add(user);
    }

    @Override
    public void delete(int id) {
        getSqlSession().getMapper(UserMapper.class).delete(id);
    }
}
