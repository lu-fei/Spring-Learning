package com.yr.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    /**
     * @param result：返回值
     * */
    @Override
    public void afterReturning(Object result, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "返回结果为:" + result);
    }
}
