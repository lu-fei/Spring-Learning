package com.yr.service;

import com.yr.dao.UserDao;

public class UserServiceImpl implements UserService{
    //    private UserDao userDao = new UserDaoImpl();
    //    private UserDao userDao = new UserDaoMysqlImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
