package com.yr.dao;

import com.yr.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUsers();
}
