package com.yr.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 因为我们在 XML 中配置了 <context:component-scan base-package="com.yr.pojo"/>，即扫描这个包中的文件
 * 所以下面的 @Component 相当于 <bean id="user" class="com.yr.pojo.User"/>
 * */
@Component
@Scope(value = "singleton")
public class User {

    /* 下面这个 @Value(”路飞“) 相当于 public String name = "路飞";
    * <property name="name" value="路飞">*/
    @Value("路飞")
    public String name;
}
