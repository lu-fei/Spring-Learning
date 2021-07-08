package com.yr.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



/* @Component 表示一个类会作为组件类，并且Spring会为这个类创建bean
*   如果在 @Config 中配置了 @Bean， 那么这里这个 @Component 可以不写*/
//@Component
public class User {

    // 这个 @Value 可以加在属性上，也可以加在方法上
    @Value("路飞")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
