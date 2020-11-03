package com.sunrise.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理框架
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target;
    public void setTarget(Object target) {
        this.target = target;
    }
    //生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //代理类的操作
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    //增加日志方法
    public void log(String msg){
        System.out.println("[LOG:]执行了"+msg+"方法");
    }
}
