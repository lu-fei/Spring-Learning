package com.yr.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setHost(userService);

        userServiceProxy.insert();
        userServiceProxy.update();
    }
}
