package com.sunrise.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被处理的接口
    private Rent rent;
    //通过set方法获取代理的接口
    public void setRent(Rent rent) {
        this.rent = rent;
    }
    //动态生成代理类，里面3个参数：1.加载类的位置，2.获取接口，3.调用InvocationHandler自己
    public Object getProxy(){
      return  Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    /**
     * 实现接口，处理代理实例，并返回对象
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(rent, args);
        return invoke;
    }
}
