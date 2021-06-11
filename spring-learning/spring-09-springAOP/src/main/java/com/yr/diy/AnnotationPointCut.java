package com.yr.diy;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/* 使用注解方式实现 AOP
*  标注这个类是一个切面
* */
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.yr.service.UserServiceImpl.*(..))")
    public void before2(){
        System.out.println("=================方法执行前====================");
    }

    @After(("execution(* com.yr.service.UserServiceImpl.*(..))"))
    public void after2(){
        System.out.println("=================方法执行后=====================");
    }


    // 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.yr.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = jp.proceed();      // 执行方法
        System.out.println("环绕后");
    }

}
