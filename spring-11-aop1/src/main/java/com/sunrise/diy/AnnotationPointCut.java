package com.sunrise.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 方式三：使用注解实现AOP
 * 1.标记为切面类；2.设置通知方法，执行前、执行后方法；
 */

@Aspect
public class AnnotationPointCut {
    //前置切入通知
    @Before("execution(* com.sunrise.service.UserServiceImpl.* (..))")
    public void before(){
        System.out.println("*********方式三：方法执行前*********");
    }
    //后置切入通知
    @After("execution(* com.sunrise.service.UserServiceImpl.* (..))")
    public void after(){
        System.out.println("*********方式三：方法执行后*********");
    }
    //环绕增强
    @Around("execution(* com.sunrise.service.UserServiceImpl.* (..))")
    public void round(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("*********方式三：环绕前*********");
        //可以获取签名
        Signature signature = pj.getSignature();
        System.out.println("打印签名signature："+signature);
        //开启环绕增强，这时候开始调用方法：【环绕前】>【执行前】>【环绕后】>【执行后】
        Object proceed = pj.proceed();
        System.out.println("*********方式三：环绕后*********");
    }
}
