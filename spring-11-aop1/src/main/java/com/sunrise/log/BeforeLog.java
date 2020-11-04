package com.sunrise.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置执行类，相当于代理模式中，中介需要加入自己特有方法
 */
public class BeforeLog implements MethodBeforeAdvice {
    //三个参数：1.method要执行目标的方法；2.args是参数；3.目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[LOG：]"+target.getClass().getName()+"对象的"+method.getName()+"方法被执行了！");
    }
}
