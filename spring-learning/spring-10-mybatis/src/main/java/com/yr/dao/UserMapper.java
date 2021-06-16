package com.yr.dao;

import com.yr.pojo.User;
import lombok.Data;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();
}
