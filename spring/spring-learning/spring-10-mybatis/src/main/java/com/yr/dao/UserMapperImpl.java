package com.yr.dao;

import com.yr.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    // 在之前，我们所有的操作都是使用 sqlSession 来做，现在我们使用 sqlSessionTemplate(其实是一个东西)
    private SqlSessionTemplate sqlSessionTemplate;

    // spring 中万物皆可注入，所以一定要对外提供一个方法
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    // 在mybatis 中，这部分操作是在测试类中我们写的，现在我们将这部分操作放到实现类中去完成。
    @Override
    public List<User> selectUser() {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper.selectUser();
    }

}
