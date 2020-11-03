package com.sunrise.demo04;

import com.sunrise.demo02.UserService;
import com.sunrise.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //1.真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //2.代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //3.设置代理角色
        pih.setTarget(userService);
        //4.动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();


    }
}
