package com.lisery.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三:使用注解
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.lisery.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("Annotation ======== before ========");
    }

    @After("execution(* com.lisery.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("Annotation ======== after ========");
    }
}
