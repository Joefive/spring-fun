package com.sunrise.demo02;

/**
 * 客户端调用
 */
public class ClientUser {
    public static void main(String[] args) {
        //实例化Service对象
        UserServiceImpl userService = new UserServiceImpl();
        //userService.insert();
        //实例化代理对象
        ProxyUser proxyUser = new ProxyUser();
        //使用set方法来注入对象
        proxyUser.setUserService(userService);
        proxyUser.insert();
        proxyUser.delete();
        proxyUser.update();
        proxyUser.select();
    }
}
