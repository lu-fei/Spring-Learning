package com.yr.config;

import com.yr.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(value = "com.yr.pojo")
public class MyConfig {


    /**
     * 注册一个@bean，就相当于我们之前写的一个<bean></bean>标签
     * 这个方法的名字，就相当于bean标签中的 id
     * 这个方法的返回值，就相当于 bean 标签中的 class 属性
     * */
    @Bean
    public User getUser(){
        return new User();      // 就是要注入到bean中的对象
    }
}
