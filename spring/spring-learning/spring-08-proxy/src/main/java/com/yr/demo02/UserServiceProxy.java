package com.yr.demo02;

import java.lang.reflect.Proxy;

public class UserServiceProxy implements UserService{
    private UserServiceImpl host;

    public void setHost(UserServiceImpl host) {
        this.host = host;
    }

    @Override
    public void insert() {
        log("insert");
        host.insert();
    }

    @Override
    public void delete() {
        log("delete");
        host.delete();
    }

    @Override
    public void update() {
        log("update");
        host.delete();
    }

    @Override
    public void query() {
        log("query");
        host.query();
    }

    public void log(String msg){
        System.out.println("调用了" + msg + "方法");
    }

}
